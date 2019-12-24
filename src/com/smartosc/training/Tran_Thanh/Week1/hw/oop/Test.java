package Week1.hw.oop;


public class Test {
	public static void main(String [] args) {
		
		Car c1 = new Car("Volvo", 15000, 5);
		
		System.out.print(c1.toString());
		
		Bike b1 = new Bike("HK Bike", 1000, 35);
		System.out.println(b1.toString());
		
		Motor m1 = new Motor("Motor", 30000, 2016, Type.Exciter);
		System.out.println(m1.toString());
	}
}
