/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bpnm
 */
public class Thread2 extends Thread{
    private Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(true){
            synchronized(data){
                data.notifyAll();
                if(!data.isStatus()) break;
                if(data.getState() != 2){
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                else{
                    int diem = data.getSum();
                    diem++;
                    data.setSum(diem);
                    System.out.println("Diem: "+ diem);
                    data.setState(1);
                }
            }
        }
    }
    
}
