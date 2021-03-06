DESCRIPTION = "Filesys::Notify::Simple is a simple but unified interface to get \
notifications of changes to a given filesystem path. It utilizes inotify2 \
on Linux, fsevents on OS X, kqueue on FreeBSD and \
FindFirstChangeNotification on Windows if they're installed, with a \
fallback to the full directory scan if they're not available."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Filesys-Notify-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Filesys-Notify-Simple-0.13.tar.gz"

SRC_URI[md5sum] = "6042cd96abcc7bf69f959142d00b8143"
SRC_URI[sha256sum] = "ade3d3db882ce2137e527201893d4b8c12b2dbd15009bb89c31cb91ba6495ba2"
RDEPENDS_${PN} += "linux-inotify2-perl"
DEPENDS += "test-sharedfork-perl-native"

S = "${WORKDIR}/Filesys-Notify-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
