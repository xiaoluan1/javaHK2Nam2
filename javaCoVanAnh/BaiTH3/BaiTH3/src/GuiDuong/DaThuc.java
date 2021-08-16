/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiDuong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongPham
 */
public class DaThuc {

    private BufferedReader br;

    public DaThuc() {
        try {
            br = new BufferedReader(new FileReader("src/GuiDuong/dathuc.txt"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaThuc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double[] doc() {
        double[] t = null;
        try {
            String line = br.readLine();
            int n = Integer.parseInt(line);
            t = new double[n + 1];
            line = br.readLine();
            String[] data = line.split("\\s+");
            for (int i = 0; i < t.length; i++) {
                t[i] = Double.parseDouble(data[i]);
            }
        } catch (IOException ex) {
            Logger.getLogger(DaThuc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    public void in(double[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
    }
    
    public double[] tong(double[] a,double[] b) {
        double[] t = null;
        if(a.length>b.length){
            t=a;
            for (int i = 0; i < b.length; i++) {
                t[i]+=b[i];
            }
        }
        else{
            t=b;
            for (int i = 0; i < a.length; i++) {
                t[i]+=a[i];
            } 
        }
        
        return t;
    }
    
    
    public void ghi(double[] t,double x){
        try {
            FileWriter fw = new FileWriter("src/GuiDuong/ketqua.txt");
            
            String giaTri="";
            giaTri+=x;
            String line="";
            for (int i = 0; i < t.length; i++) {
                line+=t[i]+" ";
            }
            fw.write(giaTri+"\n");
            fw.write(line+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(DaThuc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void finalize(){
        try{
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
