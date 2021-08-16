package entity;

public class NhaXuatBan {
	private String tenNXB, tenNDD, ngayTL;
	private int namTl;

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public String getTenNDD() {
		return tenNDD;
	}

	public void setTenNDD(String tenNDD) {
		this.tenNDD = tenNDD;
	}

	public String getNgayTL() {
		return ngayTL;
	}

	public void setNgayTL(String ngayTL) {
		this.ngayTL = ngayTL;
	}

	public int getNamTl() {
		return namTl;
	}

	public void setNamTl(int namTl) {
		this.namTl = namTl;
	}

	public NhaXuatBan(String tenNXB, String tenNDD, String ngayTL, int namTl) {
		super();
		this.tenNXB = tenNXB;
		this.tenNDD = tenNDD;
		this.ngayTL = ngayTL;
		this.namTl = namTl;
	}

	public NhaXuatBan() {
		super();
	}

	@Override
	public String toString() {
		return "NhaXuatBan [tenNXB=" + tenNXB + ", tenNDD=" + tenNDD + ", ngayTL=" + ngayTL + ", namTl=" + namTl + "]";
	}
	
    
}
