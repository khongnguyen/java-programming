package entiti;

public class NhanVienMKT extends NhanVien {
	private String div;

	public NhanVienMKT(String name, int age, String gender, String address, String div) {
		super(name, age, gender, address);
		this.div = div;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}
	
	@Override
	public String toString() {
		return "NhanVienMKT{"+
				"div='" + div + '\''+
				",name='" + na + '\''+
				", age=" + age +
				", gender='" + gender + '\'' +
				 ", address='" + address + '\'' +
				 '}';
				
	}
	

}
