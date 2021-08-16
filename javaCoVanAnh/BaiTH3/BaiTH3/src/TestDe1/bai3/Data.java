/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe1.bai3;

import java.util.Vector;

/**
 *
 * @author CuongPham
 */
public class Data {
    private int index;
    private Vector<Integer> vector;
    private boolean status;

    public Data() {
        index=1;
        vector=new Vector<>();
        status=true;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Vector<Integer> getVector() {
        return vector;
    }

    public void setVector(Vector<Integer> vector) {
        this.vector = vector;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
