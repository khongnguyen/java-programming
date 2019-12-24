/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Namcx12
 */
public class StudentController {

    public void addNewStudent(ArrayList<Student> st) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Add Student Information");
        System.out.println("---------------------------------");
        System.out.print("Enter Id: ");
        int id = Integer.valueOf(sc.nextLine());
        System.out.print("Enter Name: ");
        String stuName = sc.nextLine();
        System.out.println("Enter Certificate: ");
        String certificate = sc.nextLine();

        st.add(new Student(id, stuName, certificate));

        System.out.println("Add Successfully");

    }

    public void displayList(ArrayList<Student> st) {
        //To print the informations of Student
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i).toString());
        }
    }

    public void dele(ArrayList<Student> st) {
        Scanner sc = new Scanner(System.in);

        if (st.size() == 0) {
            System.err.print("\n Data is empty, pls add more student!");
        }
        System.out.println("Delete Student");
        System.out.print("Enter Code Of Student want to Delete:");
        int id = sc.nextInt();
        System.out.println("\n----------------Delete Student------------");
        st.remove(id - 1);
        System.out.println("\n\t Delete Successfull !!");
    }

    public void menuOption() {
        System.out.println("\n\n(▰˘◡˘▰) (▰˘◡˘▰) WELCOME TO STUDENT MANAGEMENT (▰˘◡˘▰) (▰˘◡˘▰) ");
        System.out.println(" 1.	Create");
        System.out.println(" 2.	List");
        System.out.println(" 3.	Delete");
        System.out.println(" 4. Exit");
        System.out.print(" Enter your choice: ");
    }

    public int getValidNum(int min, int max) {
        //Loop to get input has a valid number
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int temp = Integer.parseInt(sc.nextLine());
                if (temp > max || temp < min) {
                    throw new NumberFormatException();
                }
                return temp;
            } catch (NumberFormatException e) {
                System.err.println("Pls enter a integer number in range [" + min + "," + max + "]");
            }
        }
    }

}
