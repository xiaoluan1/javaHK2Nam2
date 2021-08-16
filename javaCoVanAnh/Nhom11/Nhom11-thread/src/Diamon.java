/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Diamon extends Thread{
    public void run(){
        while(true){
            System.out.println("toi la Diamon thread");
            try{
                sleep(400);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
