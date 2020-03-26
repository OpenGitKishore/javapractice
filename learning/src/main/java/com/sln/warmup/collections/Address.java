package com.sln.warmup.collections;

public class Address {

    private NativeAddress nativeAddress;
    private OfficeAddress officeAddress;

    public Address() {
    }

    public Address(NativeAddress nativeAddress, OfficeAddress officeAddress) {
        this.nativeAddress = nativeAddress;
        this.officeAddress = officeAddress;
    }

    public NativeAddress getNativeAddress() {
        return nativeAddress;
    }

    public void setNativeAddress(NativeAddress nativeAddress) {
        this.nativeAddress = nativeAddress;
    }

    public OfficeAddress getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(OfficeAddress officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "{\"Address\":{"
                + "\"nativeAddress\":" + nativeAddress
                + ", \"officeAddress\":" + officeAddress
                + "}}";
    }
}
