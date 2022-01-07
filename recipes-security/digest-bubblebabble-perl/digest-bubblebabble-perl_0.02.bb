DESCRIPTION = "*Digest::BubbleBabble* takes a message digest (often generated by either of \
the MD5 or SHA-1 message digest algorithms) and creates a fingerprint of \
that digest in "bubble babble" format. Bubble babble is a method of \
representing a message digest as a string of "real" words, to make the \
fingerprint easier to remember. The "words" are not necessarily real words, \
but they look more like words than a string of hex characters."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-BubbleBabble"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BT/BTROTT/Digest-BubbleBabble-0.02.tar.gz \
	   file://0001-Makefile.PL-use-.-explicitely.patch \
"

SRC_URI[md5sum] = "4d7edd5b0a904db8194aa660d502fbe0"
SRC_URI[sha256sum] = "80cfb2d2e43d6f79400658600567d2a270b145b4eef5aea58a66957788225c00"

S = "${WORKDIR}/Digest-BubbleBabble-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"