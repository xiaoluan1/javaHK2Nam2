package bai9;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        OutputThread t1 = new OutputThread(v);
        InputThread t2 = new InputThread(v, t1);
        t2.start();
        t1.start();

    }

}
