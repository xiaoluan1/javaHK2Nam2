/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SinhVien implements Serializable{
    private String ma,ten;
    private boolean gt;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, boolean gt, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.tuoi = tuoi;
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

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public Object[] toObject(){
        return new Object[]{
        ma,ten,(gt?"Nam":"Nu"),tuoi
        };
    }
}
