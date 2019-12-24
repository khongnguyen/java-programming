package library;

import java.io.*;
import java.util.Scanner;

public class Controller {

    private Scanner input = new Scanner(System.in);

    int getHome() {
        System.out.println("1. Add Author");
        System.out.println("2. Add Publishing Company");
        System.out.println("3. Add Book");
        System.out.println("4. Info Author");
        System.out.println("5. Info Publishing Company");
        System.out.println("6. Info Book");
        System.out.println("7. Close");
        System.out.println("------------------------------------");
        System.out.println("Please enter your choice:");
        int choice = Integer.parseInt(input.nextLine());
        return choice;
    }

    private File authorFile = new File("\\Users\\DuongTrong\\Desktop\\Example\\src\\save\\author.obj");
    private File pcFile = new File("\\Users\\DuongTrong\\Desktop\\Example\\src\\save\\pc.obj");
    private File bookFile = new File("\\Users\\DuongTrong\\Desktop\\Example\\src\\save\\book.obj");

    void addAuthor() throws IOException, ClassNotFoundException {
        System.out.println("------------------------------------");
        System.out.println("How many authors do you want?");
        int intAuthor = Integer.parseInt(input.nextLine());
        for (int i = 0; i < intAuthor; i++) {
            System.out.println("------------------------------------");
            System.out.println("Please enter the author's name:");
            String name = input.nextLine();
            System.out.println("Please enter the author's birthday:");
            int age = Integer.parseInt(input.nextLine());
            System.out.println("Please enter the author's gender:");
            int gender = Integer.parseInt(input.nextLine());
            System.out.println("Please enter the author's pseudonym:");
            String pseudonym = input.nextLine();
            System.out.println("Please enter the author's address:");
            String address = input.nextLine();
            Author author = new Author(name, age, gender, pseudonym, address);
            FileOutputStream output = new FileOutputStream(authorFile);
            ObjectOutputStream outObj = new ObjectOutputStream(output);
            outObj.writeObject(author);
            outObj.close();
            output.close();
            System.out.println("Add author success!");
        }
    }

    void addPC() throws IOException, ClassNotFoundException {
        System.out.println("------------------------------------");
        System.out.println("How many publishing company do you want?");
        int intAuthor = Integer.parseInt(input.nextLine());
        for (int i = 0; i < intAuthor; i++) {
            System.out.println("------------------------------------");
            System.out.println("Please enter the publishing company name:");
            String name = input.nextLine();
            System.out.println("Please enter the publishing company address:");
            String address = input.nextLine();
            PublishingCompany pc = new PublishingCompany(name, address);
            FileOutputStream output = new FileOutputStream(pcFile);
            ObjectOutputStream outObj = new ObjectOutputStream(output);
            outObj.writeObject(pc);
            outObj.close();
            output.close();
            System.out.println("Add publishing company success!");
        }
    }

    void addBook() throws IOException, ClassNotFoundException {
        System.out.println("------------------------------------");
        System.out.println("How many book do you want?");
        int intAuthor = Integer.parseInt(input.nextLine());
        for (int i = 0; i < intAuthor; i++) {
            System.out.println("------------------------------------");
            System.out.println("Please enter the book name:");
            String name = input.nextLine();
            System.out.println("Please enter the book kind:");
            String kind = input.nextLine();
            System.out.println("Please enter the book author:");
            String author = input.nextLine();
            System.out.println("Please enter the book publishing year:");
            int py = Integer.parseInt(input.nextLine());
            System.out.println("Please enter the book publishing company:");
            String pc = input.nextLine();
            Book book = new Book(name, kind, author, py, author);
            FileOutputStream output = new FileOutputStream(bookFile);
            ObjectOutputStream outObj = new ObjectOutputStream(output);
            outObj.writeObject(book);
            outObj.close();
            output.close();
            System.out.println("Add book success!");
        }
    }

    public void infoAuthor() throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("------------------------------------");
        System.out.println("List author:");
        FileInputStream in = new FileInputStream(authorFile);
        ObjectInputStream inObj = new ObjectInputStream(in);
        Author author = (Author) inObj.readObject();
        inObj.close();
        in.close();
        System.out.println(author);
    }

    public void infoBook() throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("-------------------------------------");
        System.out.println("List book:");
        FileInputStream in = new FileInputStream(bookFile);
        ObjectInputStream inObj = new ObjectInputStream(in);
        Book book = (Book) inObj.readObject();
        inObj.close();
        in.close();
        System.out.println(book);
    }

    public void infoPublish() throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("--------------------------------------");
        System.out.println("List pub:");
        FileInputStream in = new FileInputStream(pcFile);
        ObjectInputStream inObj = new ObjectInputStream(in);
        PublishingCompany publishingCompany = (PublishingCompany) inObj.readObject();
        inObj.close();
        in.close();
        System.out.println(publishingCompany);
    }
}
