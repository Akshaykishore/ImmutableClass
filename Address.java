package com.company;

public class Address {
    int doorNo;
    String address;

    public Address(int doorNo, String address) {
        this.doorNo = doorNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", address='" + address + '\'' +
                '}';
    }
}
