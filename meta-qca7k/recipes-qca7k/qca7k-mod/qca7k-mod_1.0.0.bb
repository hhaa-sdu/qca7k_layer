# Package summary
SUMMARY = "qca7k-mod"
# License, for example MIT
# License checksum file is always required
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

inherit module 

# qca7k from local file
SRC_URI = "file://qca_7k.c \
			file://qca_7k.h \	
			file://qca_spi.c \
			file://qca_spi.h \        
            file://qca_7k_common.c \
            file://qca_7k_common.h \
	        file://qca_debug.c \
            file://qca_debug.h \
            file://Makefile \
 	        file://Kconfig \	
           "


# Change source directory to workdirectory where qca files are located
S = "${WORKDIR}"
