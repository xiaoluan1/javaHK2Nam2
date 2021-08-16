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
public class Thread3 {
    public static void main(String []args){
        CountDown a=new CountDown("A",6);
        //a.setDaemon(true);
        a.start();
        SNT b=new SNT(1000);
        b.setDaemon(true);
        b.start();
    }
}
class CountDown extends Thread{
    private Integer num;
    public CountDown(String s,Integer num){
        super(s);
        this.num=num; 
    }
    public void run(){
        //SimpleDateFormat f=new SimpleDateFormat();
        while(num>0){
            System.out.println("\033[34m Count:"+ num--);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        
    }}
class SNT extends Thread{
    private Integer num;
    public SNT(Integer num){
        this.num=num;
    }
    private boolean check(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public void run(){
        int k=3;
        while(num>0){
            if(check(k)) System.out.println(k);
            num--;
            k+=10;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}   
