
public class Author {
	String name, email, address;

	public Author(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return name + " (" + address + ") at " + email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
