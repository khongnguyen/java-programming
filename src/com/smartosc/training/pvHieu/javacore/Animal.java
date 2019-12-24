package javacore;

public class Animal {
	public int a = 10;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	public Animal() {
		System.out.println("animal");
	}
	public void run() {
		System.out.println("animal run");
	}
	public void speak() {
		System.out.println("animal speak");
	}
	
}
