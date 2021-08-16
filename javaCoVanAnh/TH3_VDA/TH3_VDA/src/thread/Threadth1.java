/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Threadth1 {
    public static void main(String[] args) {
        Clock k=new Clock();
        Color2 c=new Color2();
        Scanner in=new Scanner (System.in);
        int t=Integer.parseInt(in.nextLine());
        Count2 CD=new Count2(t);
        k.setDaemon(true);
        c.setDaemon(true);
        CD.start();
        c.start();
    }
}
class Clock extends Thread{
    SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
    public void run(){
        while(true){
        try{
            System.out.println(f.format(new java.util.Date()));
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
            }
        }
    }
}
class Color2 extends Thread{
    
    String col="RED BLUE";
    String[] c=col.split("\\s+");
    public void run(){
        int i=0;
        while(true){
            try{
                switch(c[i]){
                    case "RED":
                        System.out.println("\033[31m RED");
                        break;
                    case "BLUE":
                        System.out.println("\033[34m BLUE");
                }
                Thread.sleep(1000);
                i++;
                if(i==c.length) i=0;
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Count2 extends Thread{
    private int num;
    public Count2(int num){
        this.num=num;
    }
    public void run(){
        while(num > 0){
            try{
                System.out.println("count: "+num--);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}