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
public class ThietBi {
    //properties
    private  String ma,ten;
    private boolean xuatXu;
    private int namSX;
    //contructors

    public ThietBi() {
    }

    public ThietBi(String ma) {
        this.ma = ma;
    }

    public ThietBi(String ma, String ten, 
            boolean xuatXu, int namSX) {
        this.ma = ma;
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.namSX = namSX;
    }
    //getter & setter

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

    public boolean isXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(boolean xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
    
    
    
    public String toString(){
        return ma+"\t"+ten+"\t"+
          (xuatXu?"Hang Viet":"Hang ngoai")+"\t"+namSX;
    }
}
