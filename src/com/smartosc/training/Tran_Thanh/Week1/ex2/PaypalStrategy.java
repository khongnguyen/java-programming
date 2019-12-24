package Week1.ex2;

public class PaypalStrategy implements PaymentStrategy{
	private String email;
	private String password;
//	private int money;
	
	public PaypalStrategy (String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	@Override
	public void pay(int money) {
		// TODO Auto-generated method stub
		money = money;
	}
}
