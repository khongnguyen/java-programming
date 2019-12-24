/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore_smart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phamd
 */
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> listE = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so nhan vien:");
                n = sc.nextInt();
                
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin nhan vien thu"+(i+1));
                    Employee e = new Employee();
                    e.input();
                    listE.add(e);
            
                }
         System.out.println("Thong tin cac nhan vien:");
            for (Employee e : listE) {
                e.display();
                }
    
        if (listE.size() == 0) {
            System.err.print("\n Data is empty or no đủ, pls add more employee!");
        }
        
        System.out.print("Nhập số nhân vien muốn xóa:");
        int id = sc.nextInt();
        System.out.println("\n----------------XÓA NHÂN VIÊN------------");
        listE.remove(id - 1);
        System.out.println("\n\t Xóa Successfull !!");
    }
}
