package Day1;

public class PaypalStrategy implements PaymentStrategy {
	public String email;
	public String password;
	
	
	
	public PaypalStrategy(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	@Override
	public void pay(int number) {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Email: "+ email + " Password: " +password;
	}
}
