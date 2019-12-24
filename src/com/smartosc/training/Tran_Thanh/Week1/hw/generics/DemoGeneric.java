package Week1.hw.generics;

public class DemoGeneric {
	public static void main(String []args) {
		Generic<Integer> g;
		
		g = new Generic<Integer>(15);
		
		g.showType();
		
		int v = g.getObj();
		
		System.out.println(v);
		
//		System.out.println(g.getObj());
		
		TwoGen<Integer, String> gen = new TwoGen<Integer, String>(123, "Thanh");
		gen.showType();
		
	}
}
