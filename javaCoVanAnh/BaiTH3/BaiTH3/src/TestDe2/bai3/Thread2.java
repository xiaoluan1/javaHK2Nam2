/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe2.bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread2 extends Thread {

    private Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (data.checkCount()) {
            synchronized (data) {
                data.notifyAll();
                try {
                    while (data.getIndex() != 2 && data.checkCount()) {

                        data.wait();

                    }
                } catch (InterruptedException ex) {
                   System.out.println(ex);
                }
                int duoi = data.getNum() % 10;
                if (duoi == 0) {
                    System.out.println("TRUE");
                 
                } else {
                    System.out.println("FALSE");
                }
                data.setIndex(1);
            }
        }
        synchronized (data) {
            data.notifyAll();
        }
    }

}
