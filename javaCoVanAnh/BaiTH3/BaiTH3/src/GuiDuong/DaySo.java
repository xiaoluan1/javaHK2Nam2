/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiDuong;

import java.io.BufferedReader;
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
public class DaySo {
    private BufferedReader br;

    public DaySo() {
        try {
            br = new BufferedReader(new FileReader("src/GuiDuong/dayso.txt"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaThuc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double[] doc() {
        double[] t = null;
        try {
            String line = br.readLine();
            String[] data = line.split("\\s+");
            t=new double[data.length];
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
    
      public void ghi(double[] t){
        try {
            FileWriter fw = new FileWriter("src/GuiDuong/ketquads.txt");
            
            String line="";
            for (int i = 0; i < t.length; i++) {
                line+=t[i]+" ";
            }
            fw.write(line+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(DaThuc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
