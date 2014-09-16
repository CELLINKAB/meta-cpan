DESCRIPTION = "A \"Future\" object represents an operation that is currently in \
progress, or has recently completed. It can be used in a variety of \
ways to manage the \
flow of control, and data, through an asynchronous program."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Future"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/Future-0.29.tar.gz"

SRC_URI[md5sum] = "c73fa8c18ae9f9ff1da932e5ea6ac68e"
SRC_URI[sha256sum] = "b87fed467c572f6ae0a669d338dafffb6499f0535824ad667490785bb0daf8f6"
RDEPENDS_${PN} += "perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Future-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
