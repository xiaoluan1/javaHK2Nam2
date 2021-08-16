/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class Thread1 extends Thread{
    Data data;

    public Thread1(Data data) {
        this.data = data;
        
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader("src/bai11/number.txt");
            bufferedReader = new BufferedReader(reader);
            synchronized (data) {
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    line = line.trim();
                    int number = Integer.parseInt(line);
                    data.setNumber(number);
                    System.out.println("T1: " + line);
                    if (number % 2 == 0) {
                        data.setIndex(2);
                       // System.out.println("Index = 2 hien tai");
                    }
                    if (number % 2 != 0) {
                        data.setIndex(3);
                    }
                    data.notifyAll();
                   // System.out.println("T1 Vao hang doi");
                    data.wait();
                    Thread.sleep(1000);
                   // System.out.println("Sau khi nghi 1s");
                }
                data.setCheckstatus(false);

            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        } finally {
            try {
                if (reader != null) {

                    reader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("T1 Stop");
        synchronized(data){
            data.notifyAll();
            stop();
        }
    }
}
