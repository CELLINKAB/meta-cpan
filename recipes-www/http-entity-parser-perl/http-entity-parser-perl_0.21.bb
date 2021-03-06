DESCRIPTION = "HTTP::Entity::Parser is a PSGI-compliant HTTP Entity parser. This module \
also is compatible with HTTP::Body. Unlike HTTP::Body, HTTP::Entity::Parser \
reads HTTP entities from PSGI's environment "$env->{'psgi.input'}" and \
parses it. This module supports application/x-www-form-urlencoded, \
multipart/form-data and application/json."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Entity-Parser"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/HTTP-Entity-Parser-0.21.tar.gz"

SRC_URI[md5sum] = "50e8418bfe27ab26818ca6e264052c95"
SRC_URI[sha256sum] = "c14d3e42bdb0845eb412640ca5e396cbd52d3a9a616a5974a32a52cab487f8d8"
RDEPENDS_${PN} += "hash-multivalue-perl"
RDEPENDS_${PN} += "http-multipartparser-perl"
RDEPENDS_${PN} += "json-maybexs-perl"
RDEPENDS_${PN} += "stream-buffered-perl"
RDEPENDS_${PN} += "www-form-urlencoded-perl"
DEPENDS += "http-message-perl-native"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/HTTP-Entity-Parser-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
