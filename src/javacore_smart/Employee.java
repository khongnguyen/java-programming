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
public class Employee extends Person{
    private String company;
    private String department;
    private String position;
    private double totalSalary;

    public Employee() {
    }

    public Employee(String company, String department, String position, double totalSalary) {
        this.company = company;
        this.department = department;
        this.position = position;
        this.totalSalary = totalSalary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
    
    
    @Override
    public void display() {
        System.out.println("Employee:");
        super.display(); 
        System.out.println("\tCong ty:"+company);
        System.out.println("\tPhong ban:"+department);
        System.out.println("\tVi tri:"+position);
        System.out.println("\tTong luong:"+totalSalary);
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cong ty:");
        company = sc.nextLine();
        System.out.println("Nhap vao phong ban:");
        department = sc.nextLine();
        System.out.println("Nhap vao vi tri:");
        position = sc.nextLine();
        System.out.println("Nhap vao tong luong:");
        totalSalary = sc.nextDouble();
    }
}
