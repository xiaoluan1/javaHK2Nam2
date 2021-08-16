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
public class BangSX implements Serializable{
    private Phong p;
    private Lop l;
    private int kip;

    public BangSX() {
    }

    public BangSX(Phong p, Lop l, int kip) {
        this.p = p;
        this.l = l;
        this.kip = kip;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    public Lop getL() {
        return l;
    }

    public void setL(Lop l) {
        this.l = l;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }
    
    
    public Object[] toObjects(){
        return new Object[]{
            p.getMa(), p.getTen(), l.getMa(), l.getTen(), kip
        };
    }
}
