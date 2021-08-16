package entity;

public class GiangVienThinhGiang extends GiangVien implements HeSoLuong {

	private String coQuanLamViec;
	

	public String getCoQuanLamViec() {
		return coQuanLamViec;
	}


	public void setCoQuanLamViec(String coQuanLamViec) {
		this.coQuanLamViec = coQuanLamViec;
	}
    

	public GiangVienThinhGiang(String maGiangVien, String tenGiangVien, String email, String hocHam, String hocVi,
			String diaChi, String dienThoai, double soGioGiangDay, double heSoLuong, String coQuanLamViec) {
		super(maGiangVien, tenGiangVien, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay, heSoLuong);
		this.coQuanLamViec = coQuanLamViec;
	}

    
	public GiangVienThinhGiang() {
		super();
	}
	


	@Override
	public String toString() {
		return "GiangVienThinhGiang [coQuanLamViec=" + coQuanLamViec + "]" +super.toString();
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
