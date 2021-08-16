/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe7.bai3;

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
                try {
                    while(data.isStatus()&&data.getIndex()!=2)
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(!data.isStatus()) break;
                if(data.getNum()%10==0){
                    System.out.println("T2 -> TRUE");
                }
                else if(data.getNum()%10==5){
                    System.out.println("T2 -> FALSE");
                }
                data.setIndex(1);
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }

}
