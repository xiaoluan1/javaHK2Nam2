/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ADMIN
 */
public class SVDoc {
    List<SinhVien> list;
    public SVDoc(){
        list=new ArrayList<>();
    }
    public void doc(){
        try{
          BufferedReader br=new 
            BufferedReader(new FileReader("src/s6/sv.txt"));
          String line="";
          while((line=br.readLine())!=null){
              String[] st=line.split(";");
              SinhVien s=new SinhVien(st[0], st[1], 
                        Double.parseDouble(st[2]));
              list.add(s);
          }
          br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public void viet(){
        for(SinhVien i:list)
            System.out.println(i.toString());
    }
    public void vietFile(){
        list.add(new SinhVien("HH6543","Tran to binh",7));
        try{
           PrintWriter p=new PrintWriter("src/s6/sv.txt");
           for(SinhVien i:list){
               String line=i.getMa()+";"+i.getTen()+";"+i.getDiem();
               p.write(line+"\n");
           }
           p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
