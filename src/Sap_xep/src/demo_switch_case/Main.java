/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_switch_case;

import java.util.Scanner;

/**
 *
 * @author phamd
 */
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        PersonManagement pm = new PersonManagement();
        
        while(true){
            System.out.println("---------MENU--------");
            System.out.println("1. Input Person list");
            System.out.println("2. Display person list");
            System.out.println("3. Find persón");
            System.out.println("4. Exit");
            System.out.println("Your choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    pm.setPerson();
                    break;
                case 2:
                    pm.getPerson();
                    break;
                case 3:
                    pm.findPerson();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Must be input from 1 to 4");
            }
        }
    }
}
