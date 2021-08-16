package entity;

public class IntlPhoneNumber extends PhoneNumber{
	private String maQuocGia;

	public String getMaQuocGia() {
		return maQuocGia;
	}

	public void setMaQuocGia(String maQuocGia) {
		this.maQuocGia = maQuocGia;
	}

	public IntlPhoneNumber(String maQuocGia) {
		super();
		this.maQuocGia = maQuocGia;
	}

	public IntlPhoneNumber(String nV, String maVung, String maQuocGia) {
		super(nV, maVung);
		this.maQuocGia = maQuocGia;
	}

}
