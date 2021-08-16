/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe4.bai3;

/**
 *
 * @author CuongPham
 */
public class Data {
    private int index;
    private int diem;
    private int num;

    public Data() {
        index=1;
        diem=0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public synchronized boolean checkDiem(){
        if(diem>=4) return false;
        return true;
    }

}
