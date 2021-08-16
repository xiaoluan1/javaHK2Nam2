/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe10.bai3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CuongPham
 */
public class CauHoi {
    private String noiDung;
    private List<PhuongAn> list;

    public CauHoi() {
        list = new ArrayList<PhuongAn>();
    }

    public CauHoi(String noiDung, List<PhuongAn> list) {
        this.noiDung = noiDung;
        this.list = list;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public List<PhuongAn> getList() {
        return list;
    }

    public void setList(List<PhuongAn> list) {
        this.list = list;
    }
    
    
    
    
    
}
