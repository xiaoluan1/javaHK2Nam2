/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.text.SimpleDateFormat;

/**
 *
 * @author ADMIN
 */
public class Bai2 {
    public static void main(String[] args) {
        Timing t1=new Timing();
        t1.setName("Current Time");
        t1.setDaemon(true);
        t1.start();
        
        CountDown t2=new CountDown(6);
        t2.setName("Happy new year");
        t2.start();
        
        Prime3 t3=new Prime3(6);
        t3.start();
    }
}
class Timing extends Thread{
    public void run(){
        SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
        while(true){
                    System.out.println("\033[34m "+f.format(new java.util.Date()));
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
    }
class CountDown extends Thread{
    private int num;
    public CountDown(int num){
        this.num=num;
    }
    public void run(){
        while(num>=0){
            System.out.println("\033[31m count:"+
                    num--);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Prime3 extends Thread{
    private int num;
    public Prime3(int num){
        this.num=num;
    }
    private boolean isPrime(int n){
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    private boolean isPrime3(int n){
        if(isPrime(n)&&(n%10==3))
            return true;
        else
            return false;
    }
    public void run(){
        int c=3;
        for (int i = 0; i < num; i++) {
            while(true){
                if(isPrime3(c)){
                    System.out.println("\033[35m Prime:"+c);
                    c++;
                    break;
                }else
                    c++;
            }
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
