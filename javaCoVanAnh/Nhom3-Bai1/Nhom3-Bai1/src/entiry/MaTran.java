
package entiry;
import java.util.Arrays;
import java.util.Scanner;

public class MaTran {
    private int[][] a;
    //private int hang,cot;
    public MaTran(int hang,int cot){
        a=new int[hang][cot];
    }
    /*
    1. Nhập vào 1 ma trận
2. Viết ra 
3. Ma trận chuyển vị
4. Tổng hàng

    */
     public void nhap(){
         Scanner in=new Scanner(System.in);
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[0].length; j++) {
                 System.out.print(i+","+j+"= ");
                 a[i][j]=Integer.parseInt(in.nextLine());
             }
         }
         
     }   
     public void viet(){
         for (int i = 0; i < a.length; i++) {
             System.out.println(Arrays.toString(a[i]));
         }
     }

    public void setA(int[][] a) {
        this.a = a;
    }

    
     
     public MaTran chuyenvi(){
         int[][] c=new int[a[0].length][a.length];
         MaTran t=new MaTran(a[0].length, a.length);
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[0].length; j++) {
                 c[i][j]=a[j][i];
             }
         }
         t.setA(c);
         return t;
     }
     public void tongHang(){
         for (int i = 0; i < a.length; i++) {
             int s=0;
             for (int j = 0; j < a[0].length; j++) {
                 s+=a[i][j];
             }
             System.out.println(s);
         }
     }
}
