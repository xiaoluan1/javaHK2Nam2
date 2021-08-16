/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class sach implements Serializable{
    private String id;
    private int soLuong;

    public sach() {
    }

    public sach(String id, int soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "sach{" + "id=" + id + ", soLuong=" + soLuong + '}';
    }
    
    
}
