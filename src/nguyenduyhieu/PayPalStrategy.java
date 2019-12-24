package nguyenduyhieu;

public class PayPalStrategy implements PaymentStrategy {
	private String emailId;
	private String password;

	public PayPalStrategy(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	@Override
	public void pay(int price) {
		boolean connection = login();
		if (connection) {
			// subtract from balance
		}
	}

	public boolean login() {
		boolean isConnected = false;
		try {
			// connect to paypal

		} catch (Exception e) {
			return false;
		}
		return isConnected;
	}

}
