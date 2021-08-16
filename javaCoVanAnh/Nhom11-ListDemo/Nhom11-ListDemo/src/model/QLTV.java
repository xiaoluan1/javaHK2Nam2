/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Sach;
import entity.TaiLieu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLTV {
    private List<TaiLieu> list;
    private Scanner in;
    public QLTV(){
        list=new ArrayList<>();
        in=new Scanner(System.in);
    }
    private boolean getTaiLieuByMa(String ma){
        for(TaiLieu i:list){
            if(i.getMa().equalsIgnoreCase(ma)){
                return true;
            }
        }
        return false;
    }
    private TaiLieu nhap(){
        String ma="",tenXB;
        int soBan;
        while(true){
           System.out.print("Ma:");
           ma=in.nextLine().toUpperCase();
           if(ma.matches("^[A-Z]{2}\\d{3}")&&(!getTaiLieuByMa(ma)))
               break;
           else
               System.err.println("Nhap lai!!!");
        }
        System.out.print("Ten XB:");
        tenXB=in.nextLine();
        System.out.print("So ban:");
        soBan=Integer.parseInt(in.nextLine());
        return new TaiLieu(ma, tenXB, soBan);
        }
    public void nhapSach(){
        TaiLieu t=nhap();
        String tenTg,tenS;
        int soTrang;
        System.out.print("Ten Sach:");
        tenS=in.nextLine();
        System.out.print("Ten TG:");
        tenTg=in.nextLine();
        System.out.print("So trang:");
        soTrang=Integer.parseInt(in.nextLine());
        Sach s=new Sach(t.getMa(),tenS, tenTg,
                    t.getTenNXB(), soTrang,t.getSoBan());
        list.add(s);
    }
    public void vietDS(){
        System.out.println("Ma\tTen sach\tTenTG\tTen NXB\tSo trang\tSo ban");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Sach)
                System.out.println(list.get(i).toString());
        }
        
    }
}
