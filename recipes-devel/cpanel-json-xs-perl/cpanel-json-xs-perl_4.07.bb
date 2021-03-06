DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be *correct* and its secondary goal is to be *fast*. To \
reach the latter goal it was written in C."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cpanel-JSON-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/Cpanel-JSON-XS-4.07.tar.gz"

SRC_URI[md5sum] = "c7d32fb0480c794a8ed85aff435340b6"
SRC_URI[sha256sum] = "8b54bd6771ddf8293d71d9c85a5c6b6e7e0c5903e7f8db900e573a6c32be12c3"

S = "${WORKDIR}/Cpanel-JSON-XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
