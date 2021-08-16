/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe5.bai3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CuongPham
 */
public class Data {
    private int index;
    private CauHoi cauHoi;
    private int diem;
    private boolean status;

    public Data() {
        cauHoi=new CauHoi();
        index=1;
        diem=0;
        status=true;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public CauHoi getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(CauHoi cauHoi) {
        this.cauHoi = cauHoi;
    }

    

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
