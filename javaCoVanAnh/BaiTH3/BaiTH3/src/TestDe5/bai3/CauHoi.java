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
public class CauHoi {
    private int ma;
    private String cauHoi;
    private List<PhuongAn> phuongAns = new ArrayList<>();

    public CauHoi() {
    }

    public CauHoi(int ma, String cauHoi) {
        this.ma = ma;
        this.cauHoi = cauHoi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public List<PhuongAn> getPhuongAns() {
        return phuongAns;
    }

    public void setPhuongAns(List<PhuongAn> phuongAns) {
        this.phuongAns = phuongAns;
    }

    
    
    
    
}
