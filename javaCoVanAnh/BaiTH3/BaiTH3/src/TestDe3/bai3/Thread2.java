/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe3.bai3;

/**
 *
 * @author CuongPham
 */
public class Thread2 extends Thread{
    private Data data;

    public Thread2(Data data) {
        this.data = data;
    }
    
    

    @Override
    public void run() {
        while(data.isStatus()){
            synchronized(data){
                data.notifyAll();
                try{
                    while(data.getIndex()!=2 && data.isStatus()){
                        data.wait();
                    }
                }catch(InterruptedException ex){
                    System.out.println(ex);
                }
                if(!data.isStatus()) break;
                String[] soTu=data.getS().split("\\s+");
                System.out.println("T2: "+soTu.length);
                data.setIndex(1);
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }
    
    
}
