package javacore;

public class Main {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.run();
		a.speak();
		System.out.println(a.getA());
		
		Animal b = new UKCat();
		UKCat c = (UKCat)b;
		c.drink();
		
	}
}
