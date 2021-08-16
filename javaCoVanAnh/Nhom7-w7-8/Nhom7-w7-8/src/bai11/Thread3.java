/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author ADMIN
 */
public class Thread3 extends Thread{
    Data data;
    
    public Thread3(Data data) {
        this.data = data;
       
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            
            
            synchronized (data) {
                data.notifyAll();
                while (data.getIndex() != 3 && data.isCheckstatus()) {
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                if(data.isCheckstatus()== false){
                    break;
                }
                int number = data.getNumber();

                System.out.println("T3: " + number * number);
                data.setIndex(1);
            }
        }
        System.out.println("T3: Stop");
        synchronized (data) {
            stop();
        }
    }
}
