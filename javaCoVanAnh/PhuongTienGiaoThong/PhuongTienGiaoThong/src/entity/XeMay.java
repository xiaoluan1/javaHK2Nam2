package entity;

public class XeMay extends PTGT {
	private double congSuat;

	public XeMay() {
		super();
	}

	public XeMay(double congSuat) {
		super();
		this.congSuat = congSuat;
	}

	public double getCongSuat() {
		return congSuat;
	}
   
	public XeMay(double gia, String hang, String mau, int nam, double congSuat) {
		super(gia, hang, mau, nam);
		this.congSuat = congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public String toString() {
		return "XeMay [congSuat=" + congSuat + "]" + "\t" + super.toString();
	}

}
