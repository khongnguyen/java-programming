package exercise;

public class Animals {
	private String name;
	private String type;
	
	public Animals(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void eat() {
		System.out.println("Eating ...");
	}
	
	public void sleep() {
		System.out.println("Sleeping ...");
	}
	
	public void run() {
		System.out.println("Run away ... ");
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + " \nType: " + this.getType();
	}
}


