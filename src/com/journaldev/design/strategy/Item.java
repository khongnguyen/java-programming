package com.journaldev.design.strategy;

public class Item {
	private String upcCode;
	private int price;
	public Item(String upcCode, int price) {
		this.price = price;
		this.upcCode = upcCode;
	}
	public String getUpcCode() {
		return this.upcCode;
	}
	public int getPrice() {
		return this.price;
	}
}
