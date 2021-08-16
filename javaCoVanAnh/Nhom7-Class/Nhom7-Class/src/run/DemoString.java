
package run;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DemoString {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        String hoten;
//         System.out.print("Ho va ten:");
//         hoten=in.nextLine().trim();
//         String ten;
//         ten=hoten.substring(hoten.lastIndexOf(" ")+1);
//         System.out.println(ten);
//         String ngaysinh;
//         while(true){
//             System.out.print("Ngay sinh:");
//             ngaysinh=in.nextLine();
//             if(ngaysinh.matches("\\d{1,2}/\\d{1,2}/\\d{4}"))
//                 break;
//             else
//                 System.err.println("invalid date");
//         }
//         int nam=Integer.parseInt(ngaysinh.
//                 substring(
//                 ngaysinh.lastIndexOf("/")+1));
//         SimpleDateFormat f=new 
//        SimpleDateFormat("dd/MM/yyyy");
//         String sd=f.format(new Date());
//         int namht=Integer.parseInt(sd.substring(
//                 sd.lastIndexOf("/")+1));
//         int tuoi=namht-nam;
//         System.out.println(tuoi);
//         f=new SimpleDateFormat("hh:mm:ss");
//         System.out.println(f.format(new Date()));
           String p;
           p=in.nextLine();
           p=p.replaceAll("\\s*\\,", "\\,");
           System.out.println(p);
//           p.replaceAll("\\s*\\.", "\\.");
//           p.replaceAll("\\s*\\?", "\\?");
//           p.replaceAll("\\s*\\!", "\\!");
//           System.out.println(p);
           String[] tu=p.split("\\s+");
           System.out.println(tu.length);
           
           String pr="toi yeu ha noi.";
           String pp=Character.toUpperCase(pr.charAt(0))+
                   pr.substring(1);
           System.out.println(pp);
           StringBuilder s=new StringBuilder();
           
    }
    
}
