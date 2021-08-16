/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bpnm
 */
public class DaThuc {
    private BufferedReader br;

    public DaThuc() {
        try {
            br = new BufferedReader(new FileReader("src/bai2/dathuc.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public int[] doc(){
        int kq[] = null;
        try {
            String[] s = br.readLine().split("\\s+");
            int bac = Integer.parseInt(s[0]);
            kq = new int[bac+1];
            String[] s1 = br.readLine().split("\\s+");
            for(int i = 0; i < s1.length; i++) kq[i] = Integer.parseInt(s1[i]);
            for(int i = s1.length; i <= bac; i++) kq[i] = 0;
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return kq;
    }
    public int giaTriTaiO(int a[]){
        return a[0];
    }
    public int[] tong(int a[], int b[]){
        if(a.length > b.length){
            int kq[] = new int[a.length];
            for(int i = 0; i < b.length; i++){
                kq[i] = a[i]+b[i];
            }
            for(int i = b.length; i < a.length; i++) kq[i] = a[i];
            return kq;
        }
        else{
            int kq[] = new int[b.length];
            for(int i = 0; i < a.length; i++){
                kq[i] = a[i]+b[i];
            }
            for(int i = a.length; i < b.length; i++) kq[i] = b[i];
            return kq;
        }
    }
}
