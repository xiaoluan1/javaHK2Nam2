/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Thread5 {
    public static void main(String[] args) {
        Color C=new Color();
        C.start();
    }
}
class Color extends Thread{
    public void run(){
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap mau:");
        String mau=in.nextLine().toUpperCase().trim();
        String[] c=mau.split("\\s+");
        int i=0;
        while(true){
            try{
                switch(c[i]){
                    case "BLACK":
                        System.out.println("\033[0m BLACK");
                        break;
                    case "RED":
                        System.out.println("\033[31m RED");
                        break;
                    case "GREEN":
                        System.out.println("\033[32m GREEN");
                        break;
                    case "YELLOW":
                        System.out.println("\033[33m YELLOW");
                        break;  
                    case "BLUE":
                        System.out.println("\033[34m BLUE");
                        break;
                    case "MAGENTA":
                        System.out.println("\033[35m MAGENTA");
                        break;
                    case "CYAN":
                        System.out.println("\033[36m CYAN");
                        break;
                    case "WHITE":
                        System.out.println("\033[37m WHITE");
                        break;    
                }
                Thread.sleep(1000);
                i++;
                if(i==c.length) i=0;
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}