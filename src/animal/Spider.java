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
public class Spider extends Animal {
    public Spider(){
        super(8);
    }
    
    @Override
    public void eat(){
      System.out.println("Spider: eatt()");
    }
    
    public void play(){
        System.out.println("Spider no play()");
    }
    
}
