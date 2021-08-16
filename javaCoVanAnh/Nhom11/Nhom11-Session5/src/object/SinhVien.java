/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.io.Serializable;


public class SinhVien implements Serializable{
    //(mã sinh viên, Họ tên, địa chỉ, Số ĐT)
    private int ma;
    private String ht,dc,sdt;

    public SinhVien() {
    }

    public SinhVien(int ma, String ht,
            String dc, String sdt) {
        this.ma = ma;
        this.ht = ht;
        this.dc = dc;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return ma+"\t"+ht+"\t"+dc+"\t"+sdt;
    }
    
}
