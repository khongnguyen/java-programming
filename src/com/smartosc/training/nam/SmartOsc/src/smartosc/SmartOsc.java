/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartosc;

import controller.StudentController;
import entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Namcx12
 */
public class SmartOsc {

    public static void main(String[] args) {
        StudentController stCon = new StudentController();
        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student(1, "A", "Dinh"));
        st.add(new Student(2, "B", "Dinh"));
        st.add(new Student(3, "C", "Kem"));
        st.add(new Student(4, "D", "Trung Binh"));

        while (true) {
            stCon.menuOption();
            int choice = stCon.getValidNum(1, 4);
            switch (choice) {
                case 1:
                    stCon.addNewStudent(st);
                    break;
                case 2:
                    stCon.displayList(st);
                    break;
                case 3:
                    stCon.dele(st);
                    break;
                case 4:
                    return;
            }
        }

    }

}
