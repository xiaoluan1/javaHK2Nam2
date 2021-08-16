/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bpnm
 */
public class Main {
    public static void main(String[] args) {
        DaThuc dt = new DaThuc();
        int p[] = dt.doc();
        int q[] = dt.doc();
        PrintWriter out = null;
        try {
             out = new PrintWriter("src/bai2/ketqua.txt");
             out.write(dt.giaTriTaiO(p)+" ");
             out.write("\n");
             int tong[] = dt.tong(p, q);
             for(int i = 0; i < tong.length; i++){
                 out.write(tong[i]+" ");
             }
             out.write("\n");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        finally{
            out.close();
                    
        }
    }
}
