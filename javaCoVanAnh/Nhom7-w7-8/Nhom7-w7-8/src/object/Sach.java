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
public class Sach implements Serializable{
    //(mã sách, Tên sách, 
    //Tác giả, Chuyên ngành, Năm xuất bản,
   //Số lượng)
    private int ma,nam,soluong;
    private String ten,cnganh;

    public Sach() {
    }

    public Sach(int ma, String ten, String cnganh,
            int nam, 
            int soluong) {
        this.ma = ma;
        this.nam = nam;
        this.soluong = soluong;
        this.ten = ten;
        this.cnganh = cnganh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCnganh() {
        return cnganh;
    }

    public void setCnganh(String cnganh) {
        this.cnganh = cnganh;
    }

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+cnganh+"\t";
    }
    
    
}
