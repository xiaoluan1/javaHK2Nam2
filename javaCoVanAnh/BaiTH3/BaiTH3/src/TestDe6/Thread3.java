/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe6;

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
        while (data.isStatus()) {
            synchronized (data) {

                data.notifyAll();
                try {
                    while (data.isStatus() && data.getIndex() != 3) {
                        data.wait();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(!data.isStatus()) break;
                String[] datas = data.getS().split("[\\s\\d]+");
                System.out.println("T3 -> So tu: " + datas.length);
                data.setIndex(1);
            }
        }
        synchronized (data) {
            data.notifyAll();
        }

    }

}
