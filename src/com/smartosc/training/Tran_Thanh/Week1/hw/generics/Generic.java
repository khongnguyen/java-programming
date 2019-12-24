package Week1.hw.generics;

public class Generic<Gen>{
	Gen obj;

	public Generic(Gen obj) {
		this.obj = obj;
	}

	public Gen getObj() {
		return obj;
	}
	
	public void showType() {
		System.out.println("The type of Gen is:" + obj.getClass().getName());
	}
}
