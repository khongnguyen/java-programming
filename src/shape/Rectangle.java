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
public class Rectangle extends Shape {
    private int length;
    private int width;
    
    public Rectangle(String color, int length, int width){
        this.setColor(color);
        this.length = length;
        this.width = width;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return this.length* this.width;
    }
    
    @Override
    public String toString(){
        return "rectangle: length=" + this.getLength() +" width="
                +this.getWidth() + super.toString();
    }

    
}
