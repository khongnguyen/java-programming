/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_switch_case;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phamd
 */
public class PersonManagement {
    private List<Person> listP = new ArrayList<>();
    
    public void setPerson(){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Nhap vao so person:");
            n = sc.nextInt();
            if(n<0 || n>10)
                System.out.println("Nhap lai");
            else
                break;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho person thu "+(i+1));
            Person p = new Person();
            p.input();
            listP.add(p);
        }   
    }
    public void getPerson(){
        System.out.printf("%-10s%-30s%-20s%-20s%-20s","Id","Name","Address","gender","birthDay");
        System.out.println("");
        for (Person p : listP) {
            System.out.printf("%-10s%-30s%-20s%-20s%-20s",p.getStudentId(),p.getStudentName(),p.getAddress(),p.getGender(),p.getBirthday());
            System.out.println("");
        }
    }
     public void findPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap item id can tim:");
        int id = sc.nextInt();
        
        int found = 0;
        for (Person p : listP) {
            if(p.getStudentId()==id){
                p.display();
                found++;
            }
        }
        System.out.println("Co"+found+" ket qua can tim!");
    }
}
