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
public class Lop implements Serializable{
    private int ma;
    private String ten;
    private int soS;
    private static int sma = 100;

    public Lop() {
        ma = sma++;
    }

    public Lop(int ma, String ten, int soS) {
        this.ma = ma;
        this.ten = ten;
        this.soS = soS;
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

    public int getSoS() {
        return soS;
    }

    public void setSoS(int soS) {
        this.soS = soS;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Lop.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ten, soS
        };
    }
}
