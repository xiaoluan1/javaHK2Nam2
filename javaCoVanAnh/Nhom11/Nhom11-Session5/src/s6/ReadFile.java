/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //open
        try{
            FileReader o=new FileReader("src/s6/hanoi.txt");
            int k;
            char c;
            while(true){
                k=o.read();
                if(k==-1)//end of file
                    break;
                c=(char)k;
                System.out.print(c);
            }
            System.out.println();
            o.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
