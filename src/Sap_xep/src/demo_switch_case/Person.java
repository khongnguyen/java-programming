/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_switch_case;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author phamd
 */
public class Person  implements IPerson{
    private int studentId;
    private String studentName;
    private String gender;
    private String address;
    private String birthday;

    public Person() {
    }

    public Person(int studentId, String studentName, String gender, String address, String birthday) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

  

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t nhap id :");
        studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("\t nhap ten :");
        studentName = sc.nextLine();
        System.out.println("\t Nhap gioi tinh");
        gender = sc.nextLine();
        System.out.println("\t Nhap dia chi");
        address = sc.nextLine();
        System.out.println("\t Nhap ngay sinh:");
        birthday = sc.nextLine();
       
        
    }

    @Override
    public void display() {
        System.out.println("\t Id");
        System.out.println("\t Ten:"+studentName);
        System.out.println("\t Gioi tinh:"+gender);
        System.out.println("\t Dia chi:"+address);
        System.out.println("\t Ngay sinh:"+birthday);
    }
    
}
