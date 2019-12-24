import java.util.Scanner;

public class Book3 extends Book2 {
	private float price;

	public Book3() {
		super();
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao price");
		price= scanner.nextFloat();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Price" + price);
	}
}
