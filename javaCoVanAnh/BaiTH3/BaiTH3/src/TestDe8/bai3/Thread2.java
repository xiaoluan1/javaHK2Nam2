/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe8.bai3;

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
                String[] datas=line.split("\\/");
                String[] heSo=datas[1].trim().split("\\s+");
                data.getDaThuc().setBac(Integer.parseInt(datas[0]));
                data.getDaThuc().setX(Integer.parseInt(datas[2]));
                data.getDaThuc().setKetQua(Integer.parseInt(datas[3]));
                int[] heSos=new int[heSo.length];
                for (int i = 0; i < heSos.length; i++) {
                    heSos[i]=Integer.parseInt(heSo[i]);
                }
                data.getDaThuc().setHeSo(heSos);
                data.setIndex(3);
            }
        }
         synchronized(data){
            data.notifyAll();
        }
    }

}
