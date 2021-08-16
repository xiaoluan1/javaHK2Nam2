/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe9.bai3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/TestDe9/bai3/cauhoi.txt"));
            String line = br.readLine();
            while (line != null) {
                synchronized (data) {
                    data.notifyAll();
                    while (data.isStatus() && data.getIndex() != 1) {
                        data.wait();
                    }
                    data.setXau(line);
                    line=br.readLine();
                    if(line==null){
                        data.setStatus(false);
                        break;
                    }
                    sleep(1000);
                    data.setIndex(2);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        synchronized(data){
            data.notifyAll();
        }
    }

}
