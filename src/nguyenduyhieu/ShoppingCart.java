package nguyenduyhieu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ShoppingCart {
	private HashMap<Item, Integer> itemList;

	public ShoppingCart() {
		this.itemList = new HashMap<Item, Integer>();
	}

	public void addItem(Item item) {
		if (this.itemList.containsKey(item)) {
			int itemCount = this.itemList.get(item);
			this.itemList.put(item, itemCount++);
		} else {
			this.itemList.put(item, 1);
		}
	}

	public void removeItem(Item item) {
		if (this.itemList.containsKey(item)) {
			int itemCount = this.itemList.get(item);
			if (itemCount > 1) {
				this.itemList.put(item, itemCount--);
			} else {
				this.itemList.remove(item);
			}
		} else {
			// do nothing
		}
	}

	public int calculateTotal() {
		int total = 0;
		for (Entry<Item, Integer> element : this.itemList.entrySet()) {
			int subTotal = element.getKey().getPrice() * element.getValue();
			total += subTotal;
		}
		return total;
	}

	public void pay(PaymentStrategy payStrat) {
		payStrat.pay(this.calculateTotal());
	}
}
