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
public class Prime extends Thread{
    public boolean isPrime(int num){
        if(num%10 != 3) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }
        return true;
    }
    int c = 3;

    @Override
    public void run() {
        while(true){
            while(!isPrime(c)) c++;
            if(isPrime(c)){
                System.out.println("Prime: "+c);
                c++;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
   
}
