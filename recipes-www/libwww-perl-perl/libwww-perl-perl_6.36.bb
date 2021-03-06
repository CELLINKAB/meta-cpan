DESCRIPTION = "The libwww-perl collection is a set of Perl modules which provides a simple \
and consistent application programming interface (API) to the World-Wide \
Web. The main focus of the library is to provide classes and functions that \
allow you to write WWW clients. The library also contain modules that are \
of more general use and even classes that help you implement simple HTTP \
servers."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/libwww-perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/libwww-perl-6.36.tar.gz"

SRC_URI[md5sum] = "20062717e4084d2f56d84c7ab4c91ec1"
SRC_URI[sha256sum] = "75c034ab4b37f4b9506dc644300697505582cf9545bcf2e2079e7263f675290a"
RDEPENDS_${PN} += "encode-locale-perl"
RDEPENDS_${PN} += "file-listing-perl"
RDEPENDS_${PN} += "html-parser-perl"
RDEPENDS_${PN} += "http-cookies-perl"
RDEPENDS_${PN} += "http-daemon-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "http-negotiate-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"
RDEPENDS_${PN} += "net-http-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN} += "uri-perl"
RDEPENDS_${PN} += "www-robotrules-perl"
DEPENDS += "test-needs-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requiresinternet-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/libwww-perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
