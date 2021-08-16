/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe1.bai2;

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
public class MaTran {

    private int h, c;
    private BufferedReader bufferedReader;

    public MaTran() {
        try {
            bufferedReader = new BufferedReader(new FileReader("src/TestDe1/bai2/matran.txt"));
            String line = bufferedReader.readLine();
            String[] data = line.split("\\s+"); // cat dong theo khoang trang thanh cac so
            h = Integer.parseInt(data[0]);
            c = Integer.parseInt(data[1]);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MaTran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MaTran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int[][] read() {
        int[][] t = new int[h][c];
        try {
            for (int i = 0; i < h; i++) {

                String line = bufferedReader.readLine();
                String[] data = line.split("\\s+"); // cat dong theo khoang trang thanh cac so

                for (int j = 0; j < c; j++) {
                    t[i][j] = Integer.parseInt(data[j]);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);

        }

        return t;

    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void in(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] cong(int[][] a, int[][] b) {
        int[][] t = new int[h][c];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                t[i][j] = a[i][j] + b[i][j];
            }
        }
        return t;
    }

    public void ghi(int[][] t) {
        try {
            FileWriter fileWriter = new FileWriter("src/TestDe1/bai2/ketqua.txt");
            
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[0].length; j++) {
                    fileWriter.write(t[i][j] + " ");
                }
                fileWriter.write("\n");
            }
            fileWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(MaTran.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
