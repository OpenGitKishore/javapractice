package com.sln.warmup.collections;

public class PayingGuest extends  Address {

    private String name;
    private String surName;
    private String phoneNumber;
    private boolean addressProof;

    public PayingGuest() {
    }

    public PayingGuest(String name, String surName, String phoneNumber, boolean addressProof) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.addressProof = addressProof;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isAddressProof() {
        return addressProof;
    }

    public void setAddressProof(boolean addressProof) {
        this.addressProof = addressProof;
    }

    @Override
    public String toString() {
        return "{\"PayingGUest\":{"
                + "\"name\":\"" + name + "\""
                + ", \"surName\":\"" + surName + "\""
                + ", \"phoneNumber\":\"" + phoneNumber + "\""
                + ", \"addressProof\":\"" + addressProof + "\""
                + "}}";
    }
}
