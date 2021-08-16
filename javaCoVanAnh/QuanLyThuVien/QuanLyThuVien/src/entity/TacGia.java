package entity;

public class TacGia {
	private String ten,butDanh,ngaySinh;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getButDanh() {
		return butDanh;
	}

	public void setButDanh(String butDanh) {
		this.butDanh = butDanh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public TacGia() {
		super();
	}

	public TacGia(String ten, String butDanh, String ngaySinh) {
		super();
		this.ten = ten;
		this.butDanh = butDanh;
		this.ngaySinh = ngaySinh;
	}

	@Override
	public String toString() {
		return "TacGia [ten=" + ten + ", butDanh=" + butDanh + ", ngaySinh=" + ngaySinh + "]";
	}
	

}
