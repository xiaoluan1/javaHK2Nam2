/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe2.bai3;

/**
 *
 * @author CuongPham
 */
public class Data {
    private int index;
    private int count;
    private int num;

    public Data() {
        count=0;
        index=1;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public synchronized void demTang(){
        count++;
    }
    
    public synchronized boolean checkCount(){
        if(count>=5) return false;
        return true;
    }
}
