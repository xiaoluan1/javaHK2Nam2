package entity;

public class GiangVien {
	private String maGiangVien,tenGiangVien,email,hocHam,hocVi,diaChi,dienThoai;
	private double soGioGiangDay,heSoLuong;

	public String getMaGiangVien() {
		return maGiangVien;
	}

	public void setMaGiangVien(String maGiangVien) {
		this.maGiangVien = maGiangVien;
	}

	public String getTenGiangVien() {
		return tenGiangVien;
	}

	public void setTenGiangVien(String tenGiangVien) {
		this.tenGiangVien = tenGiangVien;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHocHam() {
		return hocHam;
	}

	public void setHocHam(String hocHam) {
		this.hocHam = hocHam;
	}

	public String getHocVi() {
		return hocVi;
	}

	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public double getSoGioGiangDay() {
		return soGioGiangDay;
	}

	public void setSoGioGiangDay(double soGioGiangDay) {
		this.soGioGiangDay = soGioGiangDay;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public GiangVien(String maGiangVien, String tenGiangVien, String email, String hocHam, String hocVi, String diaChi,
			String dienThoai, double soGioGiangDay, double heSoLuong) {
		super();
		this.maGiangVien = maGiangVien;
		this.tenGiangVien = tenGiangVien;
		this.email = email;
		this.hocHam = hocHam;
		this.hocVi = hocVi;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.soGioGiangDay = soGioGiangDay;
		this.heSoLuong = heSoLuong;
	}

	public GiangVien() {
		super();
	}

	@Override
	public String toString() {
		return " [maGiangVien=" + maGiangVien + ", tenGiangVien=" + tenGiangVien + ", email=" + email
				+ ", hocHam=" + hocHam + ", hocVi=" + hocVi + ", diaChi=" + diaChi + ", dienThoai=" + dienThoai
				+ ", soGioGiangDay=" + soGioGiangDay + ", heSoLuong=" + heSoLuong + "]";
	}
	

}
