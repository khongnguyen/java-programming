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
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(double radius, double height){
        this.setRadius(radius);
        this.height= height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height= height;
    }
    
    //the tich
    public double getVolume(){
        return super.getArea()* this.height;
    }
    
    @Override
    //dien tich xung quanh
    public double getArea(){
        return 2 * Math.PI * super.getRadius() * this.height;
    }
    
    @Override
    public String toString(){
        return "Cylinder: radius= " + this.getRadius() + " height:"
                + this.getHeight() + " volume:" + this.getVolume()
                + " surface area:" + this.getArea() + super.toString();
    }
    
}
