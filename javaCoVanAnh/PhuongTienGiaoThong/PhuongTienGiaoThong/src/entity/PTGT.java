package entity;

public class PTGT {
	private double gia;
	private String hang, mau;
	private int nam;

	public PTGT() {
		super();
	}

	public PTGT(double gia, String hang, String mau, int nam) {
		super();
		this.gia = gia;
		this.hang = hang;
		this.mau = mau;
		this.nam = nam;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	@Override
	public String toString() {
		return "PTGT [gia=" + gia + ", hang=" + hang + ", mau=" + mau + ", nam=" + nam + "]";
	}
	

}
