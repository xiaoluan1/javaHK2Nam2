/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try{
          FileReader r=new FileReader("src/io/hanoi.dat");
          int k;
          char c;
          while(true){
              k=r.read();
              if(k==-1)
                  break;
              c=(char)k;
              System.out.print(c);
          }
          r.close();
            System.out.println();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
