package Day1;

public class SaleItems extends Item {
	int sale;

	public SaleItems(String upcCode, int price, int sale) {
		super(upcCode, price);
		this.sale = sale;
		// TODO Auto-generated constructor stub
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}
	
	public void caculatePrice(int sale) {
		price = (price * sale)/100;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+upcCode + ", price:"+ price + ",sale "+ sale+"]";
	}

}
