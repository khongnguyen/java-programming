package javacore;

public class Dog extends Animal{
	public int a = 11;
	int b = 11;
	public Dog() {
		System.out.println("dog");
	}
	public void run() {
		System.out.println("jump");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
