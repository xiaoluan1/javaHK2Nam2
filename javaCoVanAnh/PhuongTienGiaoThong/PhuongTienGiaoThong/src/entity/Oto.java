package entity;

public class Oto extends PTGT {
	private String kieu;
	private int soCho;

	public Oto() {
		super();
	}

	


	public Oto(double gia, String hang, String mau, int nam, String kieu, int soCho) {
		super(gia, hang, mau, nam);
		this.kieu = kieu;
		this.soCho = soCho;
	}

	@Override
	public String toString() {
		return "Oto [kieu=" + kieu + ", soCho=" + soCho + "]" + "\t" + super.toString();
	}

	public String getKieu() {
		return kieu;
	}

	public void setKieu(String kieu) {
		this.kieu = kieu;
	}

	public int getSoCho() {
		return soCho;
	}

	public void setSoCho(int soCho) {
		this.soCho = soCho;
	}

}
