/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe4.bai3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread1 extends Thread{
    private Data data;
    Random random = new Random();

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
       while(data.checkDiem()){
           synchronized(data){
               int num=random.nextInt(10)+1;
               data.setNum(num);
               System.out.println("\033[34m"+num);
               try {
                   sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
               }
               boolean xu=random.nextBoolean();
               System.out.println(xu);
               if(xu){
                   data.setIndex(2);
               }
               else data.setIndex(3);
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
