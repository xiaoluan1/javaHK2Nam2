/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;



/**
 *
 * @author ADMIN
 */
public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Bat dau runnable");
        for (int i = 0; i < 10; i++) {
            System.out.println("Trong runnable:"+i);
            try{
               Thread.sleep(1000);//1s
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Ket thuc runnable");
    }
    
}
