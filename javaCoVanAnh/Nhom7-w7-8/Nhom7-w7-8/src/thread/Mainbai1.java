/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.text.SimpleDateFormat;


public class Mainbai1{
    
    public static void main(String[] args) {
       new Thread( new Runnable(){
           SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
           @Override
            public void run() {
                while(true){
                    System.out.println(f.format(new java.util.Date()));
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
            
        }).start();
    }
}
