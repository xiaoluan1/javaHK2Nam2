
package s6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Matrix {
    private int h,c;
    private BufferedReader br;
    public Matrix(){
        try{
            br=new BufferedReader(new FileReader("src/s6/matran.txt"));
            String[] s=br.readLine().split("\\s+");
            h=Integer.parseInt(s[0]);
            c=Integer.parseInt(s[1]);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public int[][] read() {
        int[][] t=new int[h][c];
        try{
        for (int i = 0; i < h; i++) {
            String[] s=br.readLine().split("\\s+");
            for (int j = 0; j < c; j++) {
                t[i][j]=Integer.parseInt(s[j]);
            }
        }
        }catch(IOException e){
            System.out.println(e);
        }
        return t;
    }
    public int[][] plus(int[][] a,int[][] b){
        int[][] t=new int[h][c];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                t[i][j]=a[i][j]+b[i][j];
            }
        }
        return t;
    }
    public int[][] subtract(int[][] a,int[][] b){
        int[][] t=new int[h][c];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                t[i][j]=a[i][j]-b[i][j];
            }
        }
        return t;
    }
    public void out(int[][] a){
        for (int i = 0; i < h; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
    public void finalize(){
        try{
          br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
