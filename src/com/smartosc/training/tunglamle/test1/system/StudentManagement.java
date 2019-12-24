/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.system;

import com.aptech.aprotraln.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lam Chuot
 */
public class StudentManagement {

    List<Student> list = new ArrayList<>();

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu :" + (i + 1));
            Student s = new Student();
            s.input();
            list.add(s);

        }
    }

    public void showStudent() {
        System.out.println("Thong tin student");
        for (Student s : list) {
            s.display();
        }
    }

    public void sortStudentByMark() {
        System.out.println("Sap xep tang dan theo diem");
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getMark() - (o2.getMark()));
            }
        });
        for (Student s : list) {
            s.display();

        }
    }
    

}
