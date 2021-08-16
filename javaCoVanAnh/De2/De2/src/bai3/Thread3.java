/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author bpnm
 */
public class Thread3 extends Thread{
    private Data data;

    public Thread3(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(true){
            synchronized(data){
                data.notifyAll();
                if(!data.isStatus()) break;
                if(data.getState() != 3){
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                else{
                    int diem = data.getSum();
                    if(data.getDd() != data.getVal()){
                        System.out.println("Du doan sai");
                        if(diem >= 1) diem--;
                        System.out.println("Diem: "+diem);
                        data.setSum(diem);
                    }
                    else{
                        System.out.println("Du doan dung");
                        diem += 3;
                        System.out.println("Diem: "+diem);
                        data.setSum(diem);
                    }
                    System.out.print("Nhap vao so du doan tiep theo: ");
                    Scanner in = new Scanner(System.in);
                    int dd = Integer.parseInt(in.nextLine());
                    data.setDd(dd);
                    data.setState(1);
                }
            }
        }
    }
    
}

