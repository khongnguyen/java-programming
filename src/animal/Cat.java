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
public class Cat extends Animal  implements Pet {
    private String name;
    public Cat( String name){
        super(4);
      //  this.setLegs(8);
        this.name= name;
    }
    
    public Cat(){
       this("");
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name= name;
    }
    
    public void play(){
        System.out.println("cat: play()");
    }
    
    @Override
    public void eat(){
         System.out.println("Cat: eat()");
    }
     
    public void stay(){
         System.out.println("cat: stay()");
    }
    
    public void age(){
        System.out.println("cat: age()");
    }
}
