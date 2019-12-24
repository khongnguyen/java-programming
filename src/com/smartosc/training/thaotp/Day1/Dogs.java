package exercise;

public class Dogs extends Animals{
	private int age;
	private String origin;
	
	public Dogs(String name, String type, int age, String origin) {
		super(name, type);
		this.age = age;
		this.origin = origin;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void bark() {
		System.out.println("Go go ...");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " \nAge: " + this.getAge() + " \nOrigin: " + this.getOrigin();
	}
}
