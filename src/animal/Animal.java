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
public abstract class Animal {
    private int legs;

//    public Animal() {
//    }
    
    public Animal(int legs){
        this.legs = legs;
    }
    
//    public void setLegs(int legs){
//        this.legs= legs;
//    }
    
    public void walk(){
        System.out.println("this animal walk by " + this.legs + "legs");
    }
    
    public abstract void eat();
}
