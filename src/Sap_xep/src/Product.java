
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phamd
 */
public class Product implements Comparable<Product>{
    private String proId;
    private String proName;
    private String producer;
    private int yearMaking;
    private double price;

    public Product() {
    }

    public Product(String proId, String proName, String producer, int yearMaking, double price) {
        this.proId = proId;
        this.proName = proName;
        this.producer = producer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham:");
        proId = sc.nextLine();
        System.out.println("Nhap ten san pham:");
        proName = sc.nextLine();
        System.out.println("Nhap ten nha san xuat:");
        producer = sc.nextLine();
        System.out.println("Nhap nam san xuat:");
        yearMaking = sc.nextInt();
        System.out.println("Nhap gia ban:");
        price = sc.nextDouble();
    }
    public void display(){
        System.out.println("Product:");
        System.out.println("\tProId:"+proId);
        System.out.println("\tProName:"+proName);
        System.out.println("\tProducer:"+producer);
        System.out.println("\tYear Making:"+yearMaking);
        System.out.println("\tPrice:"+price);
    }

    @Override
    public int compareTo(Product o) {
        return yearMaking-o.getYearMaking(); //sắp xếp tăng dần theo năm sản xuất
    }
    
    
}
