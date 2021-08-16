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
public class Thread8 {
    public static void main(String[] args){
        Time t=new Time();
        t.setDaemon(true);
        Dog d=new Dog();
        
        
        t.start();
        d.start();
        try{
            d.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        Person p=new Person();
        p.start();
    }
}
class Time extends Thread{
    SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
    public void run(){
        while(true){
            System.out.println("Clock"+ f.format(new java.util.Date()));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Dog extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("DOG: watch watch watch");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("DOG: Go go go");
    }
}
class Person extends Thread{
    public void run(){
        System.out.println("Person: Wow, big dog, run run run");
        int n=10;
        for(int i=0;i<5;i++){
            System.out.println("Run :"+ n );
            n+=10;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Person: STOP");
    }
}
