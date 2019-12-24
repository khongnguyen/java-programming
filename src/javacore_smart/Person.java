/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore_smart;

import java.util.Scanner;

/**
 *
 * @author phamd
 */
public class Person {
    private String fullName;
    private boolean gender;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String fullName, boolean gender, String birthday, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten:");
        fullName = sc.nextLine();
        System.out.println("Nhap vao gioi tinh:");
        gender = sc.nextBoolean();
        System.out.println("Nhap vao ngay sinh:");
        sc.nextLine();
        birthday = sc.nextLine();
        System.out.println("Nhap vao que quan:");
        address = sc.nextLine();
    }
    
    public void display(){
        System.out.println("\tHo ten:"+fullName);
        System.out.println("\tGioi tinh: "+(gender?"Male":"Female"));
        System.out.println("\tNgay sinh:"+birthday);
        System.out.println("\tQue quan:"+address);
    }
}
