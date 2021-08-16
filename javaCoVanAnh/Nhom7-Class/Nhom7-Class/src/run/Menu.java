package run;


import entity.DaySo;
import entity.MaTran;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        MaTran m=null;
        DaySo s=null;
        while(true){
            
            System.out.println("1. nhap");
            System.out.println("2. viet");
            System.out.println("3. Tong");
            System.out.println("4. hieu");
            System.out.println("5. Nhap day so");
            System.out.println("6. viet");
            System.out.println("7. day nguyen to");
            System.out.println("0. Exit");
            System.out.print("Moi ban chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0: System.out.println("Bye!!!!!");
                    System.exit(0);
                    break;
                case 1:System.out.print("nhap n:");
                       int n=Integer.parseInt(in.nextLine());
                       m=new MaTran(n);
                       m.nhap();
                    break;
                case 2:m.viet();
                    break;
                case 3:MaTran b=new MaTran(m.getKT());
                       System.out.println("Nhap ma tran");
                       b.nhap();
                       MaTran t=m.cong(b.getA());
                       System.out.println("Ma tra 1");
                       m.viet();
                       System.out.println("Ma tran 2");
                       b.viet();
                       System.out.println("Ma tran tong");
                       t.viet();
                    break;
                case 4:MaTran b1=new MaTran(m.getKT());
                       System.out.println("Nhap ma tran");
                       b1.nhap();
                       MaTran t1=m.tru(b1.getA());
                       System.out.println("Ma tra 1");
                       m.viet();
                       System.out.println("Ma tran 2");
                       b1.viet();
                       System.out.println("Ma tran hieu");
                       t1.viet();
                    break;
                case 5:System.out.print("nhap m:");
                       int x=Integer.parseInt(in.nextLine());
                       s=new DaySo(x);
                       s.nhap();
                       break;
                case 6:s.viet();
                    break;
                case 7:s.vietDayNT();
                    break;    
                default:System.out.println("chi chon 0->4");
            }
        }
    }
 
}
