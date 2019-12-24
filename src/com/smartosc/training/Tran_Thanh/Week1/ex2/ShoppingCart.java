package com.smartosc.training.Tran_Thanh.Week1.ex2;

import java.util.ArrayList;

public class ShoppingCart {

	ArrayList<Item> items = new ArrayList<Item>();
	public ShoppingCart() {
		
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void removeItem(Item i) {
		items.remove(i);
	}
	
	public int calculateTotal() {
		return 0;
	}
	
	public void pay(PaymentStrategy ps) {
		
	}
}
