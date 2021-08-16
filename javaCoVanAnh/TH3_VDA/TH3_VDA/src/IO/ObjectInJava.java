/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObjectInJava {
    public static void main(String[] args) {
        
        List<sach> list = new ArrayList<>();
        list.add(new sach("may khau phu tho", 15));
        list.add(new sach("DM123", 20));
        String file="src/IO/fuckboy.txt";
        
        ReadAndWrite.write(file, list);
        
        List<sach> l1=ReadAndWrite.read(file);
        for(sach i : l1){
            System.out.println(i.toString());
        }
    }
}
