/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Administrator
 */
public class TestAnimals {
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.play();
        d.walk();
        d.eat();
        d.setName("braised fish");
        System.out.println("fish's nama: " + d.getName());
        System.out.println("*****************");
               
        System.out.println("cat's name:" + c.getName());
        c.setName("meo meo");
        System.out.println(c.getName());
        c.play();
        c.eat();
        System.out.println("--------------------");
        
        //a.play();
        a.walk();
        a.eat();
       // a.setName("braised fish");
        //System.out.println("fish's nama: " + a.getName());
        System.out.println("*****************");
        
        e.eat();
        System.out.println("--------------------");
        
        System.out.println(p.getName());
        p.setName("mypet");
        System.out.println(p.getName());
        p.play();
        
      
        
    }
}
