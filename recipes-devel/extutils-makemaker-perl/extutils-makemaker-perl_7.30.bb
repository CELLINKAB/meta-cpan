DESCRIPTION = "This utility is designed to write a Makefile for an extension module \
from a Makefile.PL. It is based on the Makefile.SH model provided by \
Andy Dougherty and the perl5-porters."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-MakeMaker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/ExtUtils-MakeMaker-7.30.tar.gz"

SRC_URI[md5sum] = "8df13e40762ab1b55a53140e42f42498"
SRC_URI[sha256sum] = "e081a8aa61c56565746bee998bf4c32926c030b84bb3f206e81714a1707f393c"

S = "${WORKDIR}/ExtUtils-MakeMaker-${PV}"

inherit cpan allarch

RDEPENDS_${PN} += "perl-module-b"
RDEPENDS_${PN} += "perl-module-base"
RDEPENDS_${PN} += "perl-module-cwd"
RDEPENDS_${PN} += "perl-module-encode-alias"
RDEPENDS_${PN} += "perl-module-extutils-manifest"
RDEPENDS_${PN} += "perl-module-i18n-langinfo"
RDEPENDS_${PN} += "perl-module-version"

do_configure_append_class-native() {
	sed -i -e "s:\(PERLRUN = .*\):\1 \"-Ilib\":" Makefile
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"