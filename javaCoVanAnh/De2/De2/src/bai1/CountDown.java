/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author bpnm
 */
public class CountDown extends Thread{
    private int num;

    public CountDown(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(num >= 0){
            System.out.println("Count Down: "+num);
            num--;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    
}
