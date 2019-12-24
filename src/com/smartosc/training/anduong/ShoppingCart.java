package com.journaldev.design.anduong;

import java.util.ArrayList;

public class ShoppingCart{
	
	ArrayList<Item> itemArr = new ArrayList();
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}
	
	public void addItem(Item i) {
		itemArr.add(i);
	}
	
	public void removeItem(Item i) {
		itemArr.remove(i);
	}
	
	public int calculateTotal() {
		int totalPrice = 0, currentItemPrice;
		for(Item i: itemArr) {
			
			if(!(i.getUpcCode().isEmpty())) {
				currentItemPrice = (i.getPrice() *30)/100;
			} else {
				currentItemPrice = i.getPrice();
			}	
			totalPrice += currentItemPrice;
		}
		
		return totalPrice;
	}
	
	public void pay(PaymentStrategy ps) {
	}
}
