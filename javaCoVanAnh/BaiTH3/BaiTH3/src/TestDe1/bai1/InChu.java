/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe1.bai1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class InChu extends Thread{
  
    @Override
    public void run() {
        System.out.println("Nhap chu");
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        
        while(true){
            
            System.out.println("\033[34m"+s);
            s=s.substring(1, s.length())+s.charAt(0);
            
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
          
        }
    }

    

    
    
    
    
    
}
