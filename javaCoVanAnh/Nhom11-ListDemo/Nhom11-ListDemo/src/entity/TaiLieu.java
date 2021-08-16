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
public class TaiLieu {
    //Mã tài liệu (không trùng), Tên nhà xuất bản, 
    //Số bản phát hành.
    private String ma,tenNXB;
    private int soBan;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, 
            int soBan) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBan = soBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
//    public String toString(){
//        return ma+"\t"+tenNXB+"\t"+soBan;
//    }
}
