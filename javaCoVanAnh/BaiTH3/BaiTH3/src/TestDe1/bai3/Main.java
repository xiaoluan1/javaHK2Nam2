/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe1.bai3;

/**
 *
 * @author CuongPham
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread2So thread2So = new Thread2So(data);
        ThreadTong threadTong = new ThreadTong(data);
        thread2So.start();
        threadTong.start();
    }
}
