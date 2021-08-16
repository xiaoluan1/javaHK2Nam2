

package s6;


public class SinhVien {
    private String ma,ten;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+diem;
    }
    
}
