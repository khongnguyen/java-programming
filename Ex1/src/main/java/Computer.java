
public class Computer {
	private String Name;
	private Author author;
	private long price;
	private int amount;

	public Computer(String Name, Author author, long price, int amount) {
		this.Name = Name;
		this.author = author;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return Name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String toString() {
		return "'" + Name + "' by " + author;
	}

}
