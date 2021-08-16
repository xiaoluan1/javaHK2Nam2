/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiDuong;

/**
 *
 * @author CuongPham
 */
public class DaThuMain {
    public static void main(String[] args) {
        DaThuc daThuc = new DaThuc();
        double[] a=daThuc.doc();
        double[] b=daThuc.doc();
        
        double[] tong=daThuc.tong(a, b);
        daThuc.ghi(tong,a[0]);
    }
    
}
