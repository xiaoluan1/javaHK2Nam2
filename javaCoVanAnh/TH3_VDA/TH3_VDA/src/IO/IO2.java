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
public class IO2 {
    public static void main(String[] args) throws FileNotFoundException {
        IO_THREAD x=new IO_THREAD();
        int[][] a=x.read();
        int[] b=x.tonghang(a, a);
        int[] c=x.cheochinh(a);
        x.Viet(a);
        x.Viet1(b);
        x.Viet1(c);
        String file="src/IO/ketqua2.txt";
        PrintWriter out;
        try{
            out=new PrintWriter(file);
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    out.write(a[i][j]+" ");
                }
                out.write("\n");
            }
            for(int i=0;i<b.length;i++){
                out.print(b[i]+" ");
            }
            out.write("\n");
            for(int i=0;i<b.length;i++){
                out.print(c[i]+" ");
            }
            out.write("\n");
            out.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
