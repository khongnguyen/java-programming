package Day1;

public class Item {

	public String upcCode;
	public int price;
	
	public Item(String upcCode, int price) {
		this.upcCode = upcCode;
		this.price = price;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+upcCode + ", price:"+ price +"]";
	}
	
	
	
	
}
