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
public class TapChi extends TaiLieu{
    //Số phát hành, tháng phát hành
    private int soPH,thang;

    public TapChi() {
    }

    public TapChi(String ma, String tenNXB, 
            int soBan,int soPH, int thang) {
        super(ma, tenNXB, soBan);
        this.soPH = soPH;
        this.thang = thang;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }
    public String toString(){
        return getMa()+"\t"
                +getTenNXB()+"\t"+getSoBan()+"\t"
                +soPH+"\t"+thang;
    }
    
}
