package view;



import java.util.Scanner;
import model.DSThiSinh;



public class Menu {
    public static void main(String[] args) {
        
        DSThiSinh ds=new DSThiSinh();
        while(true){
            System.out.println("1. Them thi sinh");
            System.out.println("2. In ds thi sinh");
            System.out.println("3. Xoa thi sinh");
            System.out.println("4. sua thi sinh");
            System.out.println("5. Tim thi sinh theo sbd");
            System.out.println("6. Sap xep thi sinh theo ma");
            System.out.println("7. Tim thi sinh theo diem");
                        
            System.out.println("0. Exit");
            System.out.print("Your choice (0->7):");
            
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 0:System.out.println("Bye!!!!");
                       System.exit(0);
                    break;
                case 1:ds.them();
                    break;
                case 2:ds.vietDS();
                    break;
                case 3: ds.xoa();
                    break;
                case 4:
                    break;
                case 5:
                    break; 
                case 6:
                    break; 
                case 7:
                    break;   
                default:System.out.println("only select 0->7");
                
            }
        }
        
    }
}
