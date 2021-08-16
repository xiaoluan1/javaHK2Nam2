/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe11.bai3;

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
        while (data.isStatus()) {
            synchronized (data) {
                data.notifyAll();
                while (data.isStatus() && data.getIndex() != 2) {
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String line=data.getS();
                String[] datas=line.split("\\/");
                data.getDaySo().setDay(datas[0].trim());
                data.getDaySo().setDapAn(datas[1].trim());
                
                data.setIndex(3);
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }

}
