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
public class Main {
    public static void main(String[] args) {
        System.out.println("Bat dau Main");
        for (int i = 0; i < 8; i++) {
            System.out.println("Main "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        ThreadDemo t=new ThreadDemo("Chieu moi");
        t.start();
        try{
            t.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        RunnableDemo r=new RunnableDemo();
        Thread t1=new Thread(r, "Tung trai");
        t1.start();
        
        System.out.println("ket thuc Main");
    }
}
