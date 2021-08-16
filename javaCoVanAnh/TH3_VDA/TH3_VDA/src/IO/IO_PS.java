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
public class IO_PS {
    public static void main(String[] args) throws FileNotFoundException {
        PhanSo x=new PhanSo();
        int[] a=x.read();
        int[] b=x.read();
        int[] c=x.tong(a, b);
        x.viet(a);
        x.viet(b);
        x.viet(c);
        String file="src/IO/KQUAPS.dat";
        PrintWriter out;
        try{
            out=new PrintWriter(file);
            for(int i=0;i<2;i++){
                out.print(a[i]+" ");
            }
            out.print("\n");
            for(int i=0;i<2;i++){
                out.print(b[i]+" ");
            }
            out.print("\n");
            for(int i=0;i<2;i++){
                out.print(c[i]+" ");
            }
            out.print("\n");
            out.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
