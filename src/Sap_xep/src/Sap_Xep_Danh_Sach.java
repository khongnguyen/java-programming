
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
public class Sap_Xep_Danh_Sach {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so san pham:");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin san pham thu "+(i+1));
            Product p = new Product();
            p.input();
            list.add(p);
        }
        
        //sap xep:
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                //Đằng trước so sánh với đằng sau thì tăng dần
                //Đằng sau so sánh với đằng trước thì giảm dần
                //Số thì dùng phép trừ, chuỗi thì dùng compareTo()
                
                //giá giảm dần
                return (int) (o2.getPrice()-o1.getPrice());
            }
        });
        System.out.println("\nDanh sách sắp xếp giảm dần theo giá:");
        for (Product p : list) {
            p.display();
        }
        
        System.out.println("\nSap xep danh sach tang dan theo ten san pham:");
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProName().compareTo(o2.getProName());
            }
        });
        for (Product p : list) {
            p.display();
        }
        
        Collections.sort(list);
        System.out.println("\nSap xep tang dan theo nam san xuat:");
        for (Product p : list) {
            p.display();
        }
    }
}