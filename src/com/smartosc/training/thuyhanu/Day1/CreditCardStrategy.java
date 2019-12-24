package Day1;

public class CreditCardStrategy implements PaymentStrategy {

	public String name;
	public String cardNumber;
	public String cvv;
	public String dateOfExpiry;
	
	public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int number) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+ " CardNumber: "+cardNumber+ " Cvv: "+ cvv+" Date: "+dateOfExpiry;
	}
	
	
	
}
