/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuferDemo {
    public static void main(String[] args) {
        String file="src/io/hanoi.dat";
        try{
            BufferedReader br=new 
              BufferedReader(new FileReader(file));
        String line="";
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
