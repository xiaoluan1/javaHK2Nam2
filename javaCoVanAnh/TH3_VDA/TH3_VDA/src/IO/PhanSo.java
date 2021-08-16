/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private BufferedReader bf;
    public PhanSo() throws FileNotFoundException{
        bf=new BufferedReader(new FileReader("src/IO/phanso.txt"));
    }
    public int[] read(){
        int[] a=new int[2];
        try{
            String[] s=bf.readLine().split("\\s+");
            for(int i=0;i<2;i++){
                a[i]=Integer.parseInt(s[i]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        return a;
    }
    private int UCLN(int a,int b){
        int temp;
        while(b!=0){
            temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    private int BCNN(int a,int b){
        return a*b/UCLN(a,b);
    }
    public int[] tong(int[] a,int[]b){
        int[] c=new int[2];
        int m=BCNN(a[1],b[1]);
        c[0]=a[0]*m/a[1]+b[0]*m/b[1];
        c[1]=m;
        return c;
    }
    public void viet(int[] a){
        for(int i=0;i<2;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("\n");
    }
}
