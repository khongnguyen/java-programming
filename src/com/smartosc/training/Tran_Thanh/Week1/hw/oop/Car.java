package com.smartosc.training.Tran_Thanh.Week1.hw.oop;

public class Car extends Vehicle{
	private int saleRate;
	
	public Car(String name, int price, int saleRate) {
		super(name, price);
		this.saleRate = saleRate;
	}
	public int getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(int saleRate) {
		this.saleRate = saleRate;
	}
	
	public double totalPrice(){
		int discount = price *saleRate/100;
		int total = price - discount;
		return total;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car <Name: " + super.name + "/Price: " + super.price + "/SaleRate:" + this.saleRate +"%" + "/Total price" + totalPrice() +">";
	}

}
