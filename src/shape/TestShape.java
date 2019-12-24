/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Administrator
 */
public class TestShape {
     public static void main(String[] args) {
      Shape s1 = new Rectangle("red", 4, 5);  // Upcast
      System.out.println(s1);  // Run Rectangle's toString()
      System.out.println("Area is " + s1.getArea());  // Run Rectangle's getArea()
      
      Shape s2 = new Triangle("blue", 4, 5);  // Upcast
      System.out.println(s2);  // Run Triangle's toString()
      System.out.println("Area is " + s2.getArea());  // Run Triangle's getArea()
   }

}
