/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Admin
 */
public class Thread2 {
    public static void main(String[] args){
        Integer n=new Integer(6);
        Count t1=new Count("T1",n);
        Count t2=new Count("T2",n);
        t1.start();
        t2.start();
    }
}
class Count extends Thread{
   private Integer num;
   public Count(String s,Integer num){
       super(s);
       this.num=num;
       
   }
   public void run(){
       synchronized(num){
           while(num>0){
               System.out.println(this.getName()+" "+num--);
               try{
                   Thread.sleep(1000);
               }catch(InterruptedException e){
                   System.out.println(e);
               }
           }
       }
   }
}
