/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bpnm
 */
public class Thread1 extends Thread{
    private Data data;
    private Random rd;
    private int num;
    private boolean check;

    public Thread1(Data data) {
        this.data = data;
        rd = new Random();
    }

    @Override
    public void run() {
        while(true){
            synchronized(data){
                num = rd.nextInt(10);
                System.out.println("Random: "+ num);
                if(data.getSum() >= 5) break;
                data.setVal(num);
                check = rd.nextBoolean();
                System.out.println(check);
                if(check) data.setState(2);
                else data.setState(3);
                data.notifyAll();
                try {
                    data.wait();
                    sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println("Thread 1 stop!");
        data.setStatus(false);
    }
    
    
}
