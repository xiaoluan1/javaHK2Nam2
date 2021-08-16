/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe11.bai3;

/**
 *
 * @author CuongPham
 */
public class Data {
    private int index;
    private boolean status;
    private String s;
    private int diem;
    private DaySo daySo;

    public Data() {
        index=1;
        status=true;
        daySo=new DaySo();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public DaySo getDaySo() {
        return daySo;
    }

    public void setDaySo(DaySo daySo) {
        this.daySo = daySo;
    }
 
}
