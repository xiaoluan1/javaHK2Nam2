/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author TGDD
 */
public class Phong implements Serializable{
    private int ma;
    private String ten;
    private int soM;
    private String kieu;
    private static int sma = 10000;
    
    public Phong() {
        ma = sma++;
    }

    public Phong(int ma, String ten, int soM, String kieu) {
        this.ma = ma;
        this.ten = ten;
        this.soM = soM;
        this.kieu = kieu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoM() {
        return soM;
    }

    public void setSoM(int soM) {
        this.soM = soM;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Phong.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ten, soM, kieu
        };
    }
}
