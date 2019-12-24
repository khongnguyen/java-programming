package com.smartosc.training.Tran_Thanh.Week1.hw.oop;

public class Bike extends Vehicle{

	public final static double TIME = 9.9;
	private double speed;
	public Bike(String name, int price, double speed) {
		super(name, price);
		this.speed = speed;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public double calDistance() {
		return speed * TIME;
	}
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", name=" + name + ", price=" + price + ", getSpeed()=" + getSpeed()
				+ ", calDistance()=" + calDistance() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}
	
	
}
