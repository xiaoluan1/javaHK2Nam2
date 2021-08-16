package entity;

public class XeTai extends PTGT {
	private double trongTai;

	public XeTai(double trongTai) {
		super();
		this.trongTai = trongTai;
	}

	public XeTai() {
		super();
	}
	

	public XeTai(double gia, String hang, String mau, int nam, double trongTai) {
		super(gia, hang, mau, nam);
		this.trongTai = trongTai;
	}

	public double getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}

	@Override
	public String toString() {
		return "XeTai [trongTai=" + trongTai + "]" + "\t" + super.toString();
	}

}
