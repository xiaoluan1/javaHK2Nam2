/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe5.bai3;

import java.util.List;
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
                try {
                    while (data.getIndex() != 2 && data.isStatus()) {
                        data.wait();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(!data.isStatus()) break;
                System.out.println("Cau hoi: " + data.getCauHoi().getCauHoi());
                List<PhuongAn> pa = data.getCauHoi().getPhuongAns();
                System.out.println("Chon 1 trong 3 dap an sau:");
                for (PhuongAn phuongAn : pa) {
                    System.out.println(phuongAn.getTraLoi() + " ");
                }
                int diem = data.getDiem();

                System.out.print("Nhap dap an cua ban: ");
                String dapAn = scanner.nextLine();
                for (PhuongAn phuongAn : pa) {
                    if (phuongAn.getTraLoi().equalsIgnoreCase(dapAn)) {
                        if (phuongAn.isDapAn()) {
                            diem++;
                            data.setDiem(diem);
                        }
                    }
                }
                System.out.println("Diem hien tai cua ban: " + data.getDiem());
                data.setIndex(1);

            }
        }

        synchronized (data) {
            data.notifyAll();
        }
    }

}
