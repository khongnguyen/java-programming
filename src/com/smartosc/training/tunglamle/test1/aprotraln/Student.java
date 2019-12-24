/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.aprotraln;

import java.util.Scanner;

/**
 *
 * @author Lam Chuot
 */
public class Student implements IStudent {

    private int id;
    private String fullname;
    private String email;
    private float mark;

    public Student() {
    }

    public Student(int id, String fullname, String email, float mark) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao id:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao fullname:");
        fullname = sc.nextLine();
        System.out.println("Nhap vao email:");
        email = sc.nextLine();
        System.out.println("Nhap vao mark:");
        mark = sc.nextFloat();
    }

    @Override
    public void display() {
        System.out.println("Id:" + id);
        System.out.println("Full name:" + fullname);
        System.out.println("Email:" + email);
        System.out.println("Mark:" + mark);
    }
}
