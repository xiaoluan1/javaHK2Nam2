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
public class Thread4 {
    public static void main(String[] args){
        new Thread(){
            public void run(){
                String sent="HOC VIEN CONG NGHE BUU CHINH VIEN THONG - KHOA CNTT";
                String temp;
                String tmp;
                while(true){
                    tmp=sent;
                    tmp=tmp.substring(tmp.length()-1);
                    sent =tmp+ sent.substring(0, sent.length()-1);
                    System.out.println(sent);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }.start();     }
}
