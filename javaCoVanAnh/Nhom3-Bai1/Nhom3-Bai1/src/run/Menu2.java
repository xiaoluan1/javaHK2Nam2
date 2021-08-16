/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import entiry.HaiSo;
import entiry.MaTran;
import java.util.Scanner;


public class Menu2 {
    public static void main(String[] args) {
        while(true){
            System.out.println("=====MAIN MENU=====");
            System.out.println("1. Ma tran");
            System.out.println("2. 2 so");
            
            System.out.println("0. Exit");
            System.out.print("Your choice (0->2):");
            
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 0:System.out.println("Bye!!!!");
                       System.exit(0);
                    break;
                case 1:
                    MaTran m=null;
                    while(choice!=5){
                          
                          System.out.println("1. nhap ma tran");
                          System.out.println("2. viet");
                          System.out.println("3. chuyen vi");
                          System.out.println("4. tong hang");
                          System.out.println("5. Tro ve main menu");
                          System.out.print("Lua chon (1->5):");
                          choice=Integer.parseInt(in.nextLine());
                          switch(choice){
                              case 1://nhap vao hang,cot
                                    System.out.print("hang:");
                                    int hang=Integer.parseInt(in.nextLine());
                                    System.out.print("cot:");
                                    int cot=Integer.parseInt(in.nextLine());
                                    // tao matran
                                    m=new MaTran(hang, cot);
                                    m.nhap();
                                  break;
                              case 2:m.viet();
                                  break;
                              case 3:MaTran t=m.chuyenvi();
                                     m.viet();
                                     System.out.println();
                                     t.viet();
                                  break;
                              case 4:m.tongHang();
                                  break;    
                          }
                       }
                case 2:
                    HaiSo h=new HaiSo();
                    while(choice!=5){
                          
                          System.out.println("1. nhap 2 so");
                          System.out.println("2. day so NT");
                          System.out.println("3. BSCNN");
                          System.out.println("5. Tro ve main menu");
                          System.out.print("Lua chon (1->5):");
                          choice=Integer.parseInt(in.nextLine());
                          switch(choice){
                              case 1:h.nhap();
                                  break;
                              case 2:h.vietDayNT();
                                  break;
                              case 3:System.out.println("bcnn("+h.getSo1()+","
                                        +h.getSo2()+"):"+h.bcnn());
                                  break;   
                          }
                       }
                default:System.out.println("only select 0->2");
                
            }
        }
    }
}
