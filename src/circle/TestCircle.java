/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Administrator
 */
public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(3);
        System.out.println(c1);
        
        Circle c2 = new Cylinder(5, 7);
        System.out.println(c2);
    }
}
