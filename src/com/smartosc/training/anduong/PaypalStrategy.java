package com.journaldev.design.anduong;

public class PaypalStrategy implements PaymentStrategy {
	
	private String emailid;
	private String password;
	
	public PaypalStrategy(String emailid, String password) {
		this.emailid = emailid;
		this.password = password;
	}

	@Override
	public void pay(int a) {
		// TODO Auto-generated method stub
		
	}

}
