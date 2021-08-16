package run;


import entiry.HaiSo;
import entiry.MaTran;
import java.util.Scanner;



public class Menu {
    public static void main(String[] args) {
        
        MaTran m=null;
        HaiSo h=new HaiSo();
        while(true){
            System.out.println("1. Nhap ma tran");
            System.out.println("2. Viet ra ma tran");
            System.out.println("3. Ma tran chuyen vi");
            System.out.println("4. Tong hang");
            System.out.println("5. Nhap 2 so");
            System.out.println("6. day so nguyen to");
            System.out.println("7. BCNN");
                        
            System.out.println("0. Exit");
            System.out.print("Your choice (0->5):");
            
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 0:System.out.println("Bye!!!!");
                       System.exit(0);
                    break;
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
                case 3: MaTran t=m.chuyenvi();
                        m.viet();
                        System.out.println();
                        t.viet();
                    break;
                case 4:m.tongHang();
                    break;
                case 5:h.nhap();
                    break; 
                case 6:h.vietDayNT();
                    break; 
                case 7:System.out.println("bcnn("+h.getSo1()+","
                        +h.getSo2()+"):"+h.bcnn());
                    break;   
                default:System.out.println("only select 0->7");
                
            }
        }
        
    }
}
