/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6;

import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class MainMaTran {
    public static void main(String[] args) {
        Matrix m=new Matrix();
        int[][] b=null;
        int[][] a=null;
        
            a=m.read();
            b=m.read();
            
        
        int[][] tong=m.plus(a, b);
        int[][] hieu=m.subtract(a, b);
        System.out.println("Tong");
        m.out(a);
        m.out(b);
        System.out.println();
        m.out(tong);
        System.out.println("hieu");
        m.out(a);
        m.out(b);
        System.out.println();
        m.out(hieu);
    }
}
