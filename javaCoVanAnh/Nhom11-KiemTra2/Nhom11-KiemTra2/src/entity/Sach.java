/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Sach extends TaiLieu implements TLGia{
    //Tên tác giả, Tên sách, số trang
    private String tenTG,tenS;
    private int soTrang;

    public Sach() {
        super();
    }

    
    public Sach(String ma,String tenS,String tenTG,
            String tenNXB,int soTrang, int soBan){
        super(ma, tenNXB, soBan);
        this.tenS=tenS;
        this.tenTG=tenTG;
        this.soTrang=soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public String toString(){
        return getMa()+"\t"+tenS+"\t"+tenTG+"\t"
                +getTenNXB()+"\t"+getSoTrang()+"\t"+getSoBan();
    }

    @Override
    public double getGia() {
        if(soTrang<200)
            return (1200*200)*0.95;
        else
            return (1200*200)*0.85;
    }
    
}
