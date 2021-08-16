/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;


public class DSThiSinh {
    private ArrayList<ThiSinh> list;
    private Scanner in;
    public DSThiSinh(){
        list=new ArrayList<ThiSinh>();
        in=new Scanner(System.in);
        list.add(new ThiSinh("B18DCCN543", "To an an",
                             4, 6, 3));
        list.add(new ThiSinh("B18DCAT876", "Tran BB",
                             4, 7, 3));
        list.add(new ThiSinh("B18DCCN098", "Cao thu Ha",
                             9, 5, 9));
    }
    public void them(){
        String sbd,ten;
        double d1,d2,d3;
        while(true){
          System.out.print("SBD:");
          sbd=in.nextLine().toUpperCase();
          if((sbd.matches("^B\\d{2}DC(CN|AT)\\d{3}"))&&(!tontaiTS(sbd))){
                  break;
          }        
          else
              System.err.println("sai nhap lai!!!");
        }
         
        System.out.print("Ten:");
        ten=in.nextLine();
        System.out.print("Diem 1:");
        d1=Double.parseDouble(in.nextLine());
        System.out.print("Diem 2:");
        d2=Double.parseDouble(in.nextLine());
        System.out.print("Diem 3:");
        d3=Double.parseDouble(in.nextLine());
        ThiSinh t=new ThiSinh(sbd, ten, d1, d2, d3);
        list.add(t);
    }
    private boolean tontaiTS(String sbd){
        for(ThiSinh i:list){
            if(i.getSbd().equalsIgnoreCase(sbd))
                return true;
        }
        return false;
    }
    public void vietDS(){
        System.out.println("SBD\tHo va ten\tTong diem");
        for(ThiSinh i:list)
            System.out.println(i.toString());
    }
    public void xoa(){
        System.out.print("nhap ma can xoa:");
        String ma=in.nextLine();
        if(!tontaiTS(ma)){
            System.out.println("em nay khong co!!!");
            return;
        }else{
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getSbd().equalsIgnoreCase(ma)){
                    list.remove(i);
                    return;
                }
            }
        }
    }
    
}
