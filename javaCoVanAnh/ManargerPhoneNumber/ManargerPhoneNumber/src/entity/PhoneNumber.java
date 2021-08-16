package entity;

public class PhoneNumber {
	private String NV, maVung;

	public String getNV() {
		return NV;
	}

	public void setNV(String nV) {
		NV = nV;
	}

	public String getMaVung() {
		return maVung;
	}

	public void setMaVung(String maVung) {
		this.maVung = maVung;
	}

	public PhoneNumber() {
		super();
	}

	public PhoneNumber(String nV, String maVung) {
		super();
		NV = nV;
		this.maVung = maVung;
	}

}
