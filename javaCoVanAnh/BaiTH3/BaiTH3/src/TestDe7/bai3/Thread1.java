/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe7.bai3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread1 extends Thread{
    private Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Random random = new Random();
        while(true){
            synchronized(data){
                int num=random.nextInt(100)+1;
                System.out.println("T1 -> Sinh so: "+num);
                if(num%10==2||num%10==3){
                    data.setStatus(false);
                    break;
                }
                data.setNum(num);
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(num%5==0){
                    data.setIndex(2);
                }
                else{
                    data.setIndex(3);
                }
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }
    
    
}
