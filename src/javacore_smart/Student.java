/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore_smart;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author phamd
 */
public class Student extends Person{
    private String schoolName;
    private String className;
    private String courseName;
    private int yearStart;
    private int yearEnd;

    public Student() {
    }

    public Student(String fullName, boolean gender, String birthday, String address) {
        super(fullName, gender, birthday, address);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

  

    
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Truong hoc:");
        schoolName = sc.nextLine();
        System.out.println("Nhap Lop hoc:");
        className = sc.nextLine();
        System.out.println("Nhap khoa hoc:");
        courseName = sc.nextLine();
        System.out.println("Nhap vao nam bat dau:");
        yearStart = sc.nextInt();
        System.out.println("Nhap vao nam ket thuc:");
        yearEnd = sc.nextInt();      
    }
    
    @Override 
    public void display() {
        System.out.println("Sinh vien:");
        super.display(); 
        System.out.println("\tTruong hoc:"+schoolName);
        System.out.println("\tLop hoc:"+className);
        System.out.println("\tKhoa hoc:"+courseName);
        System.out.println("\tNam bat dau: "+yearStart);
        System.out.println("\tNam ket thuc: "+yearEnd);
    }
}
