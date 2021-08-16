/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        List<Sach> list=new ArrayList<>();
        list.add(new Sach(100,"su that",
                "Ptit",1999,200));
        list.add(new Sach(120,"LTHDT",
                "Ptit",2010,1000));
        list.add(new Sach(200,"Mua lu",
                "Nhan dan",2020,2000));
        String file="src/object/sach.dat";
        IOFile.write(file, list);
        
        List<BanDoc> lb=new ArrayList<>();
        lb.add(new BanDoc(100,"To an an","So 1 chua boc",
                "09006677"));
        lb.add(new BanDoc(180,"Lu ha trang","kon tum",
                "09008800"));
        String filebd="src/object/bd.dat";
        IOFile.write(filebd, lb);
        
        List<Sach> l1=IOFile.read(file);
        for(Sach i:l1)
            System.out.println(i.toString());
        
        List<BanDoc> l2=IOFile.read(filebd);
        for(BanDoc i:l2)
            System.out.println(i.toString());
    }
}
