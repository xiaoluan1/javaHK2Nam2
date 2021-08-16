/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import entity.ThietBi;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        ThietBi tb=new ThietBi("D321","Cai ban",
                                true,2019);
        
        System.out.println(tb.toString());
        ThietBi b=new ThietBi();
        b.setMa("b7654");
        
        System.out.println(b.getMa());
        
    }
}
