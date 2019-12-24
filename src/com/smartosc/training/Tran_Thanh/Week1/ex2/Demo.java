package Week1.ex2;

import java.util.ArrayList;

public class Demo {
	public static void main(String [] args) {
		ArrayList<Item> listItems = new ArrayList<Item>();
		Item i1 = new Item("TVXQ", 111);
		Item i2 = new Item("BTS", 222);
		Item i3 = new Item("FIFA", 333);

		listItems.add(i1);
		listItems.add(i2);
		listItems.add(i3);
		
//		listItems.remove(i3);
		
		for (Item i: listItems) {
			System.out.println(i.toString());
		}
	}
}
