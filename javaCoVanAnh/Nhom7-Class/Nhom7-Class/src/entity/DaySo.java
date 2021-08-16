/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DaySo {
    private int[] a;
    public DaySo(int n){
        a=new int[n];
    }
    
    public void nhap(){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print(i+": ");
            a[i]=Integer.parseInt(in.nextLine());
        }
    }
    public void viet(){
        System.out.println(Arrays.toString(a));
    }
    private boolean laNGT(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void vietDayNT(){
        System.out.print("Day NT: ");
        for (int i = 0; i < a.length; i++) {
            if(laNGT(a[i]))
                System.out.print(a[i]+",");
        }
        System.out.println();
    }
}
