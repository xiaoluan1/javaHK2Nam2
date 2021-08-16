/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe9.bai3;

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
                System.out.println("Ban hay tra loi cau hoi: "+data.getCauHoi().getChuoi());
                System.out.println("Hay nhap dap an cho cau nay");
                String dapAn=scanner.nextLine();
                if(dapAn.equalsIgnoreCase(data.getCauHoi().getKetQua())){
                    data.setDiem(data.getDiem()+1);
                }
                data.setIndex(1);
            }
        }
        synchronized(data){
            data.notifyAll();
        }
        
        System.out.println("Dem cua ban: "+data.getDiem());
    }
    
}
