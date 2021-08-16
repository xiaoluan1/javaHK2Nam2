package entity;

public class GiangVienCoHuu extends GiangVien implements HeSoLuong{
	private double luongCung,soGioQuyDinhChung;
	

	public double getLuongCung() {
		return luongCung;
	}


	public void setLuongCung(double luongCung) {
		this.luongCung = luongCung;
	}


	public double getSoGioQuyDinhChung() {
		return soGioQuyDinhChung;
	}


	public void setSoGioQuyDinhChung(double soGioQuyDinhChung) {
		this.soGioQuyDinhChung = soGioQuyDinhChung;
	}
	


	public GiangVienCoHuu(String maGiangVien, String tenGiangVien, String email, String hocHam, String hocVi,
			String diaChi, String dienThoai, double soGioGiangDay, double heSoLuong, double luongCung,
			double soGioQuyDinhChung) {
		super(maGiangVien, tenGiangVien, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay, heSoLuong);
		this.luongCung = luongCung;
		this.soGioQuyDinhChung = soGioQuyDinhChung;
	}
	


	public GiangVienCoHuu() {
		super();
	}
	


	@Override
	public String toString() {
		return "GiangVienCoHuu [luongCung=" + luongCung + ", soGioQuyDinhChung=" + soGioQuyDinhChung + "]"+super.toString();
	}


	@Override
	public double heSoLuong() {
		// TODO Auto-generated method stub
		double sum = 0d;
		if(super.getHocHam().equals("dai hoc")) {
			sum=1;
		}
		if(super.getHocHam().equals("thac si")) {
			sum =  1.1;
		}
		if(super.getHocHam().equals("tien si")) {
			sum=1.2;
		}
		if(super.getHocVi().endsWith("giao su")) {
			sum=sum+0.2;
		}
		if(super.getHocVi().equals("pho giao su")) {
			sum=sum+0.1;
		}
		return sum;
	}
 
}
