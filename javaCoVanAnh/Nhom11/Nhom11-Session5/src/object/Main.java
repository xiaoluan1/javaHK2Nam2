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
        List<SinhVien> list=new ArrayList<>();
        list.add(new SinhVien(123,"To an an",
                              "Chua boc","09776698"));
        list.add(new SinhVien(198,"Dang Bang",
                              "Chua boc","09776698"));
        list.add(new SinhVien(234,"Ly thu rhuy",
                              "Chua boc","09776698"));
        String files="src/object/sv.dat";
        IOFile.write(files, list);
        List<MonHoc> ll=new ArrayList<>();
        ll.add(new MonHoc(122,"LTHDT",45,"INT123"));
        ll.add(new MonHoc(345,"CSDL",45,"INT098"));
        ll.add(new MonHoc(876,"KTVXL",45,"INT345"));
        String filem="src/object/mh.dat";
        IOFile.write(filem, ll);
        List<SinhVien> l1=IOFile.read(files);
        List<MonHoc> l2=IOFile.read(filem);
        for(SinhVien i:l1)
            System.out.println(i.toString());
        for(MonHoc i:l2)
            System.out.println(i.toString());
    }
}
