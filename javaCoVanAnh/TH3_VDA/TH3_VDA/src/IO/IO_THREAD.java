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
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class IO_THREAD {
    private int n;
    private BufferedReader br;
    public IO_THREAD(){
        try{
            br=new BufferedReader(new FileReader("src/IO/matrix1.txt"));
            String[] s=br.readLine().split("\\s+");
            n=Integer.parseInt(s[0]);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public int[][] read(){
        int[][] t= new int[n][n];
        try{
            for(int i=0;i<n;i++){
                String[] s=br.readLine().split("\\s+");
                for(int j=0;j<n;j++){
                    t[i][j]=Integer.parseInt(s[j]);
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
        return t;
    }
    public int[] tonghang(int[][] a,int[][] b){
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i]+=a[i][j];
            }
        }
        return c;
    }
    public int[] cheochinh(int a[][]){
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            c[i]=a[i][i];
        }
        return c;
    }
    public void Viet(int[][] s){
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(s[i]));
        }
    }
    public void Viet1(int[] s){
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}
