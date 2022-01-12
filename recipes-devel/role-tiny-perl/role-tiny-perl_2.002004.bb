DESCRIPTION = ""Role::Tiny" is a minimalist role composition tool."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Role-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Role-Tiny-2.002004.tar.gz"

SRC_URI[md5sum] = "9ee45591befa3d0b1094ac75d282b6ba"
SRC_URI[sha256sum] = "d7bdee9e138a4f83aa52d0a981625644bda87ff16642dfa845dcb44d9a242b45"
RRECOMMENDS:${PN} += "class-method-modifiers-perl"

S = "${WORKDIR}/Role-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"