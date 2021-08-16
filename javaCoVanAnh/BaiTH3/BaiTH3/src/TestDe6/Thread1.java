/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe6;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread1 extends Thread {

    private Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            synchronized (data) {
                System.out.println("Nhap cau");
                String s = scanner.nextLine();
                if (s.isEmpty()) {
                    data.setStatus(false);
                    break;
                }
                data.setS(s);
                try {
                    sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (s.matches("[A-Za-z\\s]+")) {
                    data.setIndex(2);
                } else if (s.matches("[A-Za-z\\s\\d]+")) {
                    data.setIndex(3);
                }
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        synchronized (data) {
            data.notifyAll();
        }

    }

}
