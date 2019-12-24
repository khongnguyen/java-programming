package Day1;import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	static List<SaleItems> listItems = new ArrayList<SaleItems>();
	
	//static List<SaleItems> listSalesItems = new ArrayList<SaleItems>();

	
	public static void main(String[] args) {
		
		// add items
		List<Item> listDataItems = new ArrayList<Item>();
		Item it1 = new Item("01", 100);
		Item it2 = new Item("02", 200);
		Item it3 = new Item("03", 200);		
		Item it4 = new Item("04", 200);
		listDataItems.add(it1);
		listDataItems.add(it2);
		listDataItems.add(it3);
		listDataItems.add(it4);

		System.out.println("List data items: ");
		for(Item item :listDataItems) {
			System.out.println("- "+item);
		}
		
		//add sale items
		List<SaleItems> listSalesItems = new ArrayList<SaleItems>();
		SaleItems it11 = new SaleItems("01", 100, 10);
		SaleItems it22 = new SaleItems("02", 200, 10);
		SaleItems it33 = new SaleItems("03", 300, 10);
		SaleItems it44 = new SaleItems("04", 400, 10);
		listSalesItems.add(it11);
		listSalesItems.add(it22);
		listSalesItems.add(it33);
		listSalesItems.add(it44);
		
		System.out.println("List sale items: ");
		for(SaleItems saleitems : listSalesItems) {
			System.out.println("- "+saleitems);
		}

		// add carts
		ShoppingCart Mycart = new ShoppingCart();
		listItems.add(it11);
		listItems.add(it22);
		listItems.add(it33);
		listItems.remove(it33);

		System.out.println("List items in Carts: ");
		for(Item item :listItems) {
			System.out.println("- "+item);
		}
		
		// caculate total
		System.out.println("TotalBefore: " + Mycart.caculateTotal());
		System.out.println("TotalAftersale: " + Mycart.caculateTotalAfterSale());

	
		// payment
		CreditCardStrategy credit = new CreditCardStrategy("Thuy", "12345678", "abc", "23/12/2019");
		System.out.println(credit.toString());		
	
	}
}
