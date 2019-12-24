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
public class Triangle extends Shape {
    private int base;
    private int height;
    
    public Triangle(String color, int base, int height){
        this.setColor(color);
        this.base= base;
        this.height= height;
    }
    
    public int getBase(){
        return this.base;
    }
    
    public void setBase(int base){
        this.base= base;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public void setHeight(int height){
        this.height= height;
    }
    
    @Override
    public double getArea(){
        return 0.5 * this.base * this.height;
    }
    
    @Override
    public  double getCircumference(){
        System.out.println("sum of 3 sides of triangle");
        return 0;
    }
    
    @Override
    public String toString(){
        return "Triangle: base = " + this.getBase() + " height = " + this.getHeight()
                + super.toString();
    }
}
