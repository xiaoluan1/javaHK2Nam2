package bai9;


import java.util.Vector;
import java.util.Scanner;

public class InputThread extends Thread {
   Vector<Integer> v;
   OutputThread t;
   public InputThread(Vector<Integer> v, OutputThread t){
       this.v=v;
       this.t=t;
   }
   public void run(){
       int x,y;
       Scanner in=new Scanner(System.in);
       while(true){
        synchronized(this){   
           System.out.println("Enter 2 numbers (0 to exit)");
           System.out.print("num 1: ");
           x=in.nextInt();
           v.add(x);
           if(x==0){
               synchronized(t){
                   t.notify();
               }
               break;
           }
           System.out.print("num 2: ");
           x=in.nextInt();
           v.add(x);
           synchronized(t){t.notify();
           }
           try{sleep(1000);}catch(InterruptedException e){
               System.out.println(e);
           }
           }
           
       }
       }
   }

