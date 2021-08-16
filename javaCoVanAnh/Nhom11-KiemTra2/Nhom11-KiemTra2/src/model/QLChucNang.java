/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public interface QLChucNang {
//    System.out.println("1. Nhap sach");
    public void nhapSach();
//            System.out.println("2. Nhap bao");
    public void nhapBao();
    
//            System.out.println("3. tap chi");
    public void vietDS();
//            System.out.println("4. viet ra ds");
    public void xoa(String ma);
//            System.out.println("5. Xoa");
    public void suaSach(String ma);
//            System.out.println("6. Sua");
    public void timkiemTheoMa(String ma);
//            System.out.println("7. Tim kiem dung (ma)");
    public void tkTheoTenNXB(String ten);
//            System.out.println("8. tim kiem chua");
    public void tkSBTuDen(int tu,int den);
//            System.out.println("9. tim kiem tu..den..");
    public void sxTheoMa();
//            System.out.println("10. sap xep ");
    public void sxTheoSB();
}
