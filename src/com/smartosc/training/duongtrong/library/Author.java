package com.smartosc.training.duongtrong.library;

import java.io.Serializable;

public class Author implements Serializable {
    private String name;
    private int age;
    private int gender;
    private String pseudonym;
    private String address;

    public Author() {
    }

    public Author(String name, int age, int gender, String pseudonym, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.pseudonym = pseudonym;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
