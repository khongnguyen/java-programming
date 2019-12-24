package Day1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	


	public ShoppingCart() {
	}
	
	public void addItem(Item items) {
		Demo.listItems.add((SaleItems) items);
		
		
	}
	
	public void removeItem(Item items) {
		Demo.listItems.remove(items);
	}
	
	public int caculateTotal() {
		int total =  0;
		for(int i = 0; i< Demo.listItems.size(); i++) {
			total += Demo.listItems.get(i).getPrice();
		}
		return total;
	}
	
	public int caculateTotalAfterSale() {
		int total =  0;
		for(int i = 0; i< Demo.listItems.size(); i++) {
			total += Demo.listItems.get(i).getPrice()- (Demo.listItems.get(i).getPrice() * Demo.listItems.get(i).getSale()) /100;
		}
		return total;
	}
	public void pay(PaymentStrategy payment) {
		
	}

}
