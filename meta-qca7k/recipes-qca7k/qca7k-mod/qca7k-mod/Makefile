obj-m += qca_7k_common.o
obj-m += qcaspi.o
qcaspi-objs := qca_7k.o qca_debug.o qca_spi.o

SRC := $(shell pwd)

all:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC)

modules_install:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules_install

headers_install:
	$(MAKE) -C INSTALL_HDR_PATH=/usr headers_install
clean:	
	rm -f *.o *~ core .depend .*.cmd *.ko *.mod.c
	rm -f Module.markers Module.symvers modules.order
	rm -rf .tmp_versions Modules.symvers

