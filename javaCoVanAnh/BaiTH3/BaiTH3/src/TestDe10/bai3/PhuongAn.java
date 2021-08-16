/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe10.bai3;

/**
 *
 * @author CuongPham
 */
public class PhuongAn {
    private String cauTraLoi;
    private boolean isOk;

    public PhuongAn(String cauTraLoi, boolean isOk) {
        this.cauTraLoi = cauTraLoi;
        this.isOk = isOk;
    }

    

    public String getCauTraLoi() {
        return cauTraLoi;
    }

    public void setCauTraLoi(String cauTraLoi) {
        this.cauTraLoi = cauTraLoi;
    }

    public boolean isIsOk() {
        return isOk;
    }

    public void setIsOk(boolean isOk) {
        this.isOk = isOk;
    }
    
    
    
}
