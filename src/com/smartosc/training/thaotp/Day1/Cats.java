package exercise;

public class Cats extends Animals {

	private int age;
	private int height;
	
	public Cats(String name, String type, int age, int height) {
		super(name, type);
		this.age = age;
		this.height = height;
	}
	
	public Cats(String name, String type) {
		super(name, type);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void catchMouse() {
		System.out.println(super.getName() + " is finding mouse ..." );
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " \nAge: " + this.getAge() + " \nHeight: " + this.getHeight();
	}
}
