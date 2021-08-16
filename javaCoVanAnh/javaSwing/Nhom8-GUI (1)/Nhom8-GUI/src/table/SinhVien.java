/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.io.Serializable;


public class SinhVien implements Serializable{
    private String ma,ten,qq;
    private boolean gt;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten,boolean gt, 
            String qq,  double diem) {
        this.ma = ma;
        this.ten = ten;
        this.qq = qq;
        this.gt = gt;
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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public Object[] toObject(){
        return new Object[]{
        ma,ten,gt?"Nam":"Nu",qq,diem
        };
    }
    
}
