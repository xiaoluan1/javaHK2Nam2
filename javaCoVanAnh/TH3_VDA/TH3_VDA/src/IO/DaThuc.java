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
public class DaThuc {
    private int n;
    private BufferedReader bf;
    public DaThuc() throws FileNotFoundException{
        bf=new BufferedReader(new FileReader("src/IO/dathuc.txt"));
    }
    public int[] read(){
        int[] a = null;
        try{
            String[] s=bf.readLine().split("\\s+");
            n=Integer.parseInt(s[0]);
            a=new int[n];
            String[] k=bf.readLine().split("\\s+");
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(k[i]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        return a;
    }
    public int[] cong(int[] a,int[] b){
        int[] c;
        if(a.length<b.length){
            c=new int[b.length];
            for(int i=0;i<a.length;i++){
                c[i+b.length-a.length]=a[i]+b[i+b.length-a.length];
            }
            for(int j=0;j<b.length-a.length;j++){
                c[j]=b[j];
            }
        }
        else{
            c=new int[a.length];
            for(int i=0;i<b.length;i++){
                c[i+a.length-b.length]=b[i]+a[i+a.length-b.length];
            }
            for(int j=0;j<a.length-b.length;j++){
                c[j]=a[j];
            }
        }
        return c;
    }
    public void viet(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("\n");
    }
}
