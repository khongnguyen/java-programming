/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.system;

import java.util.Scanner;

/**
 *
 * @author Lam Chuot
 */
public class MainClass extends StudentManagement {

    public static void main(String[] args) {
        MainClass m = new MainClass();
        int chon;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Moi ban nhap vao lua chon");
            System.out.println("-----MENU-----");
            System.out.println("1:Add New");
            System.out.println("2:Show All");
            System.out.println("3:Sort");
            System.out.println("4:Exit");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    m.addStudent();
                    break;
                case 2:
                    m.showStudent();
                    break;
                case 3:
                    m.sortStudentByMark();
                    break;

                case 4:
                    System.exit(0);
                    break;

            }

        }
    }
}
