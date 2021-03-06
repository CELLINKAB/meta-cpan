DESCRIPTION = "Text::CSV is a thin wrapper for Text::CSV_XS-compatible modules now. All \
the backend modules provide facilities for the composition and \
decomposition of comma-separated values. Text::CSV uses Text::CSV_XS by \
default, and when Text::CSV_XS is not available, falls back on \
Text::CSV_PP, which is bundled in the same distribution as this module."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-CSV"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/Text-CSV-1.97.tar.gz"

SRC_URI[md5sum] = "06e9ff3c867fa5ba7f8793ae06ea73ac"
SRC_URI[sha256sum] = "cc350462efa8d39d5c8a1da5f205bc31620cd52d9865a769c8e3ed1b41640fd5"
RRECOMMENDS_${PN} += "text-csv-xs-perl"

S = "${WORKDIR}/Text-CSV-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
