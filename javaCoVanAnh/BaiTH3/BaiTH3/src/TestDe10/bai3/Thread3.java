/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe10.bai3;

import java.util.ArrayList;
import java.util.List;
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
                
                System.out.println("Cau hoi: "+data.getCauHoi().getNoiDung());
                List<PhuongAn> pas = data.getCauHoi().getList();
                for (int i = 0; i < pas.size(); i++) {
                    System.out.println(pas.get(i).getCauTraLoi());
                }
                
                System.out.println("Nhap dap an cua minh");
                String dapAn=scanner.nextLine();
                for (int i = 0; i < pas.size(); i++) {
                    if(dapAn.equalsIgnoreCase(pas.get(i).getCauTraLoi())){
                        if(pas.get(i).isIsOk()){
                            data.setDiem(data.getDiem()+1);
                        }
                        break;
                    }
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
