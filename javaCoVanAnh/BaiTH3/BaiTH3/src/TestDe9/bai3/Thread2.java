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
public class Thread2 extends Thread {

    private Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (data.isStatus()) {
            synchronized (data) {
                data.notifyAll();
                while (data.isStatus() && data.getIndex() != 2) {
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String line=data.getXau();
                String[] datas=line.split("\\s+");
                String chuoi=datas[0]+" "+datas[2]+" "+datas[1]+" =";
                System.out.println("Cau hoi: "+chuoi);
                data.getCauHoi().setChuoi(chuoi);
                System.out.println("Nhap dap an cho cau nay");
                String ketQua=scanner.nextLine();
                data.getCauHoi().setKetQua(ketQua);
                data.setIndex(3);
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }

}
