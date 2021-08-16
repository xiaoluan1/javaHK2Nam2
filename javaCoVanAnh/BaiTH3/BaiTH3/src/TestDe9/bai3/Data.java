/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe9.bai3;

/**
 *
 * @author CuongPham
 */
public class Data {
    private int index;
    private boolean status;
    private CauHoi cauHoi;
    private String xau;
    private int diem;

    public Data() {
        index=1;
        status=true;
        cauHoi = new CauHoi();

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

    public CauHoi getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(CauHoi cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getXau() {
        return xau;
    }

    public void setXau(String xau) {
        this.xau = xau;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    
    
    
}
