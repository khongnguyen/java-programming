import exceptions.DuplicateCodeException;
import model.LiteraryStudent;
import model.MathematicsStudent;
import model.Student;
import model.eGender;

import java.util.*;

public class main {
    public static Scanner scanner = new Scanner(System.in);

    static eGender intGender(int ig) {
        if (ig == 1)
            return eGender.MALE;
        else
            return eGender.FEMALE;
    }

    public static void main(String[] args) throws DuplicateCodeException {

        MathematicsStudent mathematicsStudent = new MathematicsStudent();
        LiteraryStudent literaryStudent = new LiteraryStudent();
        Student student = new Student();

        List<MathematicsStudent> listMathematicsStudent = new ArrayList<>();
        List<LiteraryStudent> listLiteraryStudents = new ArrayList<>();
        Map<String, Student> studentMap = new HashMap<>();
        List<Student> list = new ArrayList<>();


        System.out.println("nhap vao so luong hoc sinh: ");
        int n = scanner.nextInt();
        System.out.println("nhap vao cho mathematics: ");
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao ma: ");
            String code = scanner.nextLine();
            for (Student st : list) {
                if (code.equalsIgnoreCase(st.getCode())) throw new DuplicateCodeException("code fail");
            }
            student.setCode(code);
            String name = null;
            String age = null;
            int gender = 0;
            double mark = 0.0;
            while (true) {
                try {
                    scanner.nextLine();
                    System.out.println("Nhap vao ten: ");
                    name = scanner.nextLine();
                    student.setName(name);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("Nhap vao tuoi: ");
                    age = scanner.nextLine();
                    student.setAge(age);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("Nhap vao gioi tinh: ");
                    gender = scanner.nextInt();
                    student.setGender(intGender(gender));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("Nhap vao diem: ");
                    mark = scanner.nextDouble();
                    student.setMark(mark);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            mathematicsStudent = new MathematicsStudent(code, name, age, intGender(gender), mark);
            listMathematicsStudent.add(mathematicsStudent);
            System.out.println("------------------------");
        }
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao ma: ");
            String code = scanner.nextLine();
            for (Student st : list) {
                if (code.equalsIgnoreCase(st.getCode())) throw new DuplicateCodeException("code fail");
            }
            student.setCode(code);
            String name = null;
            String age = null;
            int gender = 0;
            double mark = 0.0;
            while (true) {
                try {
                    scanner.nextLine();
                    System.out.println("Nhap vao ten: ");
                    name = scanner.nextLine();
                    student.setName(name);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("Nhap vao tuoi: ");
                    age = scanner.nextLine();
                    student.setAge(age);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("Nhap vao gioi tinh: ");
                    gender = scanner.nextInt();
                    student.setGender(intGender(gender));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("Nhap vao diem: ");
                    mark = scanner.nextDouble();
                    student.setMark(mark);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            literaryStudent = new LiteraryStudent(code, name, age, intGender(gender), mark);
            listLiteraryStudents.add(literaryStudent);
            System.out.println("------------------------");

        }

        list.addAll(listMathematicsStudent);
        list.addAll(listLiteraryStudents);
        System.out.println("\n In ra thong tin student");
        for (Student st : list) {
            System.out.println("Ma code: " + st.getCode());
            System.out.println("Name: " + st.getName());
            System.out.println("Age: " + st.getAge());
            System.out.println("Gender: " + st.getGender());
            System.out.println("Mark: " + st.getMark());
            System.out.println("-----------------\n");
        }
        System.out.println("\n1: In ra student co diem so cao nhat bang  List");
        System.out.println("\n2: In ra student co diem > 5 bang List ");
        System.out.println("\n3: Sap xep va in ra man hinh List student theo thu tu giam dan");
        System.out.println("\n4: Sap xep va in ra List student theo thu tu code tang dan");
        System.out.println("\n5: Sap xep List student theo thu tu giam dan, studen co diem bang nhau sap xep theo thu tu code tang dan, in ra man hinh");

        /*System.out.println("\nNhap vao lua chon cua ban");
        int choose;
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                break;
            case 2:
                break;
        }*/
    }
}
