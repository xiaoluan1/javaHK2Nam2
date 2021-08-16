package view;



import java.util.Scanner;
import model.QLTV;




public class Menu {
    public static void main(String[] args) {
        QLTV q=new QLTV();
        
        while(true){
            System.out.println("1. Nhap sach");
            System.out.println("2. Nhap bao");
            System.out.println("3. tap chi");
            System.out.println("4. viet ra ds");
            
                        
            System.out.println("0. Exit");
            System.out.print("Your choice (0->4):");
            
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 0:System.out.println("Bye!!!!");
                       System.exit(0);
                    break;
                case 1:q.nhapSach();
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4:q.vietDS();
                    break;
                   
                default:System.out.println("only select 0->7");
                
            }
        }
        
    }
}
