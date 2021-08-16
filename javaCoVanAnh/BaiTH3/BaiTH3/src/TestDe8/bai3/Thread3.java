/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe8.bai3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread3 extends Thread{
    private Data data;

    public Thread3(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (data.isStatus()) {
            synchronized (data) {
                data.notifyAll();
                while (data.isStatus() && data.getIndex() != 3) {
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                int[] heSo=data.getDaThuc().getHeSo();
                for (int i = 0; i < heSo.length-1; i++) {
                    System.out.print(heSo[i]+"*x^"+i+"+");
                }
                System.out.print(heSo[heSo.length-1]+"*x^"+(heSo.length-1));
                System.out.print(" Tinh p("+data.getDaThuc().getX()+") Nhap ket qua: ");
                int c=Integer.parseInt(scanner.nextLine());
                if(c==data.getDaThuc().getKetQua()){
                    data.setDiem(data.getDiem()+1);
                }
                data.setIndex(1);
            }
        }
         synchronized(data){
            data.notifyAll();
        }
         System.out.print("Diem cua ban: "+data.getDiem()+"\n");
    }
    
    
    
    
    
}
