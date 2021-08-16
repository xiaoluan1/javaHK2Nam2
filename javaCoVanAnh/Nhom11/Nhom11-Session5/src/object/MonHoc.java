/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class MonHoc implements Serializable{
    //mã môn học, Tên môn, Tổng số tiết, Loại môn học
    private int ma,tong;
    private String ten,loai;

    public MonHoc() {
    }

    public MonHoc(int ma, String ten,int tong,  String loai) {
        this.ma = ma;
        this.tong = tong;
        this.ten = ten;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+tong+"\t"+loai;
    }
    
}
