package Week1.hw.generics;

public class TwoGen<T, V> {
	T obj1;
	V obj2;
	public TwoGen(T obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public T getObj1() {
		return obj1;
	}
	public V getObj2() {
		return obj2;
	}
	
	public void showType() {
		System.out.println("The type of obj1 is:" + obj1.getClass().getName());
		System.out.println("The type of obj2 is:" + obj2.getClass().getName());
	}
}
