/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Thread9 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        Calc c=new Calc(v);
        Input i=new Input(v,c);
        i.start();
        c.start();
    }
}
class Calc extends Thread{
    private Vector<Integer> v;
    public Calc(Vector<Integer> v){
        this.v=v;
    }
    public void run(){
        int x,y,z;
        while(true){
            synchronized (this){
                try{
                    wait();
                    x=v.remove(0);
                    if(x==0){
                        break;
                    }
                    y=v.remove(0);
                    z=x+y;
                System.out.println(x+"+ "+y+" = "+z);
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
class Input extends Thread{
    private Vector<Integer> v;
    private Calc c;
    public Input(Vector<Integer> v,Calc c){
        this.c=c;
        this.v=v;
    }
    public void run(){
        int x;
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("Number 1:");
            x=Integer.parseInt(in.nextLine());
            v.add(x);
            if(x==0){
                synchronized (c){
                    c.notify();
                    break;
                }
            }
            System.out.println("Number 2:");
            x=Integer.parseInt(in.nextLine());
            v.add(x);
            synchronized (c){
                c.notify();
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
