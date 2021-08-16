/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe5.bai3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class Thread1 extends Thread{
    
   private Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
          BufferedReader br=new BufferedReader(new FileReader("src/TestDe5/bai3/cauhoi.txt"));
          String line="";
          while((line=br.readLine())!=null){
              synchronized(data){
                  int i=1;
                  String[] cat1=line.split(":");
                  String[] cat2=cat1[1].split(";");
                  CauHoi cauHoi = new CauHoi();
                  cauHoi.setMa(i);
                  cauHoi.setCauHoi(cat1[0]);
                  for (int j = 0; j < cat2.length; j++) {
                      String[] cat3=cat2[j].split("/");
                      if(cat3[1].equalsIgnoreCase("F"))
                        cauHoi.getPhuongAns().add(new PhuongAn(cat3[0], false));
                      else if(cat3[1].equalsIgnoreCase("T"))
                          cauHoi.getPhuongAns().add(new PhuongAn(cat3[0], true));
                  }
                  data.setCauHoi(cauHoi);
                  sleep(500);
                  data.setIndex(2);
                  data.notifyAll();
                  data.wait();
                  
              }
          }
          data.setStatus(false);
          
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
