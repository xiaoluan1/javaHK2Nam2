/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe1.bai3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread2So extends Thread {

    private Data data;

    public Thread2So(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/TestDe1/bai3/so.txt"));
            String line = br.readLine();
            while (line != null) {
                synchronized (data) {
                    Vector<Integer> v = new Vector<>();
                    String[] nums = line.split("\\s+");
                    int a=Integer.parseInt(nums[0]);
                    int b=Integer.parseInt(nums[1]);
                    v.add(a);
                    v.add(b);
                    sleep(1000);
                    line = br.readLine();
                    if(line==null) data.setStatus(false);
                    data.setIndex(2);
                    data.setVector(v);
                    data.notifyAll();
                    data.wait();
                }

            }
            

        } catch (IOException ex) {
            Logger.getLogger(Thread2So.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2So.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(data){
            data.notifyAll();
        }
    }

}
