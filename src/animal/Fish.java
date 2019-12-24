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
public class Fish extends Animal implements Pet {
    private String name;
    
    public Fish(){
        super(0);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name= name;
    }

    public void play(){
        System.out.println("Fish: play()");
    }
    
    @Override
    public void walk(){
        System.out.println("Fish has no walk");
    }
    
    @Override 
    public void eat(){
        System.out.println("Fish:eat()");
    }

    public void stay(){
        System.out.println("Fish: stay()");
    }
}