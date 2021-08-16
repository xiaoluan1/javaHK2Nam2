package entity;

public class Sach {
	private String butDanh, nhaXB, tenSach;

	public Sach(String butDanh, String nhaXB, String tenSach) {
		super();
		this.butDanh = butDanh;
		this.nhaXB = nhaXB;
		this.tenSach = tenSach;
	}

	public Sach() {
		super();
	}

	public String getButDanh() {
		return butDanh;
	}

	public void setButDanh(String butDanh) {
		this.butDanh = butDanh;
	}

	public String getNhaXB() {
		return nhaXB;
	}

	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	@Override
	public String toString() {
		return "Sach [butDanh=" + butDanh + ", nhaXB=" + nhaXB + ", tenSach=" + tenSach + "]";
	}
	
	

}
