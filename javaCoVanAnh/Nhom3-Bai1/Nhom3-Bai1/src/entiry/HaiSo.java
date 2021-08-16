
package entiry;

import java.util.Scanner;


public class HaiSo {
    private int so1,so2;
    public void nhap(){
         Scanner in=new Scanner(System.in);
         System.out.print("So thu nhat:");
         so1=Integer.parseInt(in.nextLine());
         System.out.print("So thu hai:");
         so2=Integer.parseInt(in.nextLine());
    } 
    private boolean laNguyenTo(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    } 
    public void vietDayNT(){
        int nho,to;
        if(so1<so2){
            nho=so1;
            to=so2;
        }else{
            nho=so2;
            to=so1;
        }
        System.out.print("Day so:");
        for (int i = nho; i <= to; i++) {
            
            if(laNguyenTo(i))
                System.out.print(i+",");
        }
        System.out.println();
    }
    private int ucln(){
        int t1=so1,t2=so2;
        while(t1!=t2){
            if(t1>t2){
                t1=t1-t2;
            }else
                t2=t2-t1;
        }
        return t1;
    }
    public int bcnn(){
        return so1*so2/ucln();
    }

    public int getSo1() {
        return so1;
    }

    public int getSo2() {
        return so2;
    }
    
}
