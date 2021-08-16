/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe4.bai3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread3 extends Thread {

    private Data data;

    public Thread3(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (data.checkDiem()) {

            synchronized (data) {
                data.notifyAll();
                try {
                    while (data.getIndex() != 3 && data.checkDiem()) {
                        data.wait();
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(!data.checkDiem()) break;
                System.out.println("Nhap so:");
                int numN = Integer.parseInt(scanner.nextLine());
                int diem = data.getDiem();
                if (numN == data.getNum()) {
                    data.setDiem(diem+3);
                    System.out.println("Diem: " + data.getDiem());
                } else {
                    if (diem >= 1) {
                        data.setDiem(diem - 1);
                        System.out.println("Diem: " + data.getDiem());
                    } else {
                        System.out.println("Diem: " + data.getDiem());
                    }
                }

                data.setIndex(1);
            }
        }
        synchronized (data) {
            data.notifyAll();
        }
    }

}
