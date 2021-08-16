/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main1 {
    public static void main(String[] args) {
        Matran m=new Matran();
        int[][] a=m.read();
        int[][] b=m.read();
        int[][] c=m.tong(a, b);
        m.viet(a);
        m.viet(b);
        m.viet(c);
        int[][] d=m.hieu(a, b);
        m.viet(d);
        String file="src/io/ketqua.dat";
        //ma tran a
        PrintWriter out;
        try{
            out=new PrintWriter(file);
            for (int i = 0; i < a.length; i++) {
                
                for (int j = 0; j < a[0].length; j++) {
                    out.write(a[i][j]+" ");
                }
                out.write("\n");
            }
            for (int i = 0; i < b.length; i++) {
                
                for (int j = 0; j < b[0].length; j++) {
                    out.write(b[i][j]+" ");
                }
                out.write("\n");
            }
            for (int i = 0; i < c.length; i++) {
                
                for (int j = 0; j < c[0].length; j++) {
                    out.write(c[i][j]+" ");
                }
                out.write("\n");
            }
            for (int i = 0; i < d.length; i++) {
                
                for (int j = 0; j < d[0].length; j++) {
                    out.write(d[i][j]+" ");
                }
                out.write("\n");
            }
            out.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        
    }
}
