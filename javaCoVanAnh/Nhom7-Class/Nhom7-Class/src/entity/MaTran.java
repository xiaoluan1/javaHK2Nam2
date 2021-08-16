/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Arrays;
import java.util.Scanner;

public class MaTran {
    private int[][] a;
    public MaTran(int n){
        a=new int[n][n];
    }

    public void setA(int[][] a) {
        this.a = a;
    }
     
    public int getKT(){
        return a.length;
    }
    public int[][] getA(){
        return a;
    }
    //nhap
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
        public MaTran cong(int[][] b){
            int[][] c=new int[a.length][a.length];
            MaTran t=new MaTran(getKT());
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            t.setA(c);
            return t;
        }
        public MaTran tru(int[][] b){
            int[][] c=new int[a.length][a.length];
            MaTran t=new MaTran(a.length);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[i][j]=a[i][j]-b[i][j];
                }
            }
            t.setA(c);
            return t;
        }
    }

