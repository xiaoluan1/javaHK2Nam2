/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe4.bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread2 extends Thread{
    private Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(data.checkDiem()){
            synchronized(data){
                data.notifyAll();
                try {
                    while(data.getIndex()!=2 && data.checkDiem()){
                        data.wait();
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(!data.checkDiem()) break;
                int diem=data.getDiem()+1;
                System.out.println("Diem: "+diem);
                data.setDiem(diem);
                data.setIndex(1);
            }
        }
        
        synchronized(data){
           data.notifyAll();
       }
    }
    
    
    
}
