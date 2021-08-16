/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe2.bai3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread1 extends Thread{
    private Random random = new Random();
    private Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(data.checkCount()){
            synchronized(data){
                data.notifyAll();
                try {
                    while (data.getIndex() != 1 && data.checkCount()) {

                        data.wait();

                    }
                } catch (InterruptedException ex) {
                   System.out.println(ex);
                }
                int num=random.nextInt(100)+1;
                System.out.println("\033[35m"+num);
                data.setNum(num);
                try {
                    sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                if(num%10==0) data.demTang();
                if(num%5==0){
                    data.setIndex(2);
                }
                else{
                    data.setIndex(3);
                }
                
                
                
                
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }
    
    
    
}
