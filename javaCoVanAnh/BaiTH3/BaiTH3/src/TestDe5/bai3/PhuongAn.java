/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe5.bai3;

/**
 *
 * @author CuongPham
 */
public class PhuongAn {
    private String traLoi;
    private boolean dapAn;

    public PhuongAn(String traLoi, boolean dapAn) {
        this.traLoi = traLoi;
        this.dapAn = dapAn;
    }

    public PhuongAn() {
    }

    public String getTraLoi() {
        return traLoi;
    }

    public void setTraLoi(String traLoi) {
        this.traLoi = traLoi;
    }

    public boolean isDapAn() {
        return dapAn;
    }

    public void setDapAn(boolean dapAn) {
        this.dapAn = dapAn;
    }
    
    
    
}
