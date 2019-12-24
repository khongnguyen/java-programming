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
public class Shape {
    private String color;
    
    public Shape(){
    }
    
    public Shape(String color){
          this.color= color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color= color;
    }
    
    public double getArea(){
        System.out.println("unknown");
        return 0;
    }
    
    public double getCircumference(){
        System.out.println("unknown");
        return 0;
    }
    
    @Override
    public String toString(){
        return " color(" + this.color + ")";
    }
}
