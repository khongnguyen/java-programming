package com.smartosc.training.duongtrong.library;

import java.io.Serializable;

public class PublishingCompany implements Serializable {
    
    private String name;
    private String address;

    public PublishingCompany() {
    }

    public PublishingCompany(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
