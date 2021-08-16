
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Bai1Demo {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
            Date d=new Date();
            SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
            System.out.println(f.format(d));
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
//class Clock extends Thread{
//    public void run(){
//        while(true){
//            Date d=new Date();
//            SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
//            System.out.println(f.format(d));
//            try{
//                sleep(1000);
//            }catch(InterruptedException e){
//                System.out.println(e);
//            }
//        }
//    }
//}
