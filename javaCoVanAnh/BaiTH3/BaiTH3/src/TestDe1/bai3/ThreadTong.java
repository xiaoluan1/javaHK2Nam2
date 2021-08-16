/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe1.bai3;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class ThreadTong extends Thread{
    private Data data;

    public ThreadTong(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(data.isStatus()){
            synchronized(data){
                data.notifyAll();
                while(data.getIndex()!=2&&data.isStatus()){
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadTong.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Vector<Integer> v = data.getVector();
                int a=v.remove(0);
                int b=v.remove(0);
                System.out.println(a+" + "+b+" = "+(a+b));
                data.setIndex(1);
                
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }
    
    
}
