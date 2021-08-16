/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Thread6 {
    public static void main(String[] args){
        Coccoc c=new Coccoc();
        c.start();
    }
}
class Coccoc extends Thread{

    private String s="09:52:00";
    SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
    public Coccoc(){
    }
    public void run(){
        while(true){
            System.out.println(f.format(new java.util.Date()));
            if(s.equalsIgnoreCase(f.format(new java.util.Date()))) System.out.println("***RENG RENG RENG***");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
