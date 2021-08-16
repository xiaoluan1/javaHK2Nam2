/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe1.bai2;

/**
 *
 * @author CuongPham
 */
public class Main {

    public static void main(String[] args) {
        MaTran mt = new MaTran();
        int[][] a = mt.read();
        int[][] b = mt.read();
        mt.ghi(mt.cong(a, b));
    }

}
