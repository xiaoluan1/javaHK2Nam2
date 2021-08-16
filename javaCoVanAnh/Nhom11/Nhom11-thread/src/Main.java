/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bat dau main");
        for (int i = 0; i < 5; i++) {
            System.out.println("Main "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        ThreadDemo t=new ThreadDemo("Mua gio");
        RunnableDemo r=new RunnableDemo();
        Thread t1=new Thread(r,"Chieu moi");
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t.start();
        
        
        
        
        
//        Diamon t2=new Diamon();
//        t2.setDaemon(true);
//        t2.start();
        System.out.println("ket thuc main");
    }
}
