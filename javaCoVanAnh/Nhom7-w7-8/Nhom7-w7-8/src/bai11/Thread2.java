/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author ADMIN
 */
public class Thread2 extends  Thread{
    Data data;

    public Thread2(Data data) {
        this.data = data;

    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {

            synchronized (data) {
                data.notifyAll();
                //System.out.println("Kiem tra index hien tai: " + data.getIndex());
                while (data.getIndex() != 2 && data.isCheckstatus()) {
                    try {
                        // System.out.println("Chay vao wait: index =" + data.getIndex());
                        data.wait();

                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                if (data.isCheckstatus() == false) {
                    break;
                }
                System.out.println("Uoc cua :" + data.getNumber());
                for (int j = 1; j < data.getNumber(); j++) {
                    if (data.getNumber() % j == 0) {
                        System.out.print(j + ",");
                    }
                }
                System.out.println("");
                data.setIndex(1);
//                System.out.println("index hien tai :" + data.getIndex());
//                System.out.println("Chay qua day t2");
            }
        }
        System.out.println("T2: Stop");
        synchronized (data) {
            stop();
        }
    }

}
