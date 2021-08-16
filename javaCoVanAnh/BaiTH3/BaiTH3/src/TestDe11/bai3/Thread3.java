/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe11.bai3;

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
                
                System.out.println("Cau hoi: "+data.getDaySo().getDay());
                System.out.println("Nhap dap an cua ban");
                String dapAn=scanner.nextLine();
                if(dapAn.equalsIgnoreCase(data.getDaySo().getDapAn())){
                    data.setDiem(data.getDiem()+1);
                }
                
                data.setIndex(1);
            }
        }
        synchronized(data){
            data.notifyAll();
        }
        System.out.println("Diem cua ban: "+data.getDiem());
    }
    
}
