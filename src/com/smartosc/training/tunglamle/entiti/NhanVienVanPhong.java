package entiti;

public class NhanVienVanPhong extends NhanVien {
	private String congviec;

	public NhanVienVanPhong(String name, int age, String gender, String address, String congviec) {
		super(name, age, gender, address);
		this.congviec = congviec;
	}

	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	
	
}
