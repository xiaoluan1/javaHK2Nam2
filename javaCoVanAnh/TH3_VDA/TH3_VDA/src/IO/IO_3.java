/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class IO_3 {
    public static void main(String[] args) throws FileNotFoundException {
        DaThuc m=new DaThuc();
        int[] a=m.read();
        int[] b=m.read();
        int[] c=m.cong(a, b);
        System.out.println(a.length+" "+b.length);
        System.out.println("\n");
        m.viet(a);
        m.viet(b);
        m.viet(c);
        String file="src/IO/ketqua3.dat";
        PrintWriter out;
        try{
            out=new PrintWriter(file);
            for(int i=0;i<a.length;i++){
                out.print(a[i]+" ");
            }
            out.print("\n");
            for(int i=0;i<b.length;i++){
                out.print(b[i]+" ");
            }
            out.print("\n");
            for(int i=0;i<c.length;i++){
                out.print(c[i]+" ");
            }
            out.print("\n");
            out.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }    
}
