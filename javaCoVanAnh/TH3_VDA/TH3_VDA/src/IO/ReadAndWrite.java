/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ReadAndWrite {
    public static <T> List<T> read(String file){
        List<T> list= new ArrayList<>();
        try{
            ObjectInputStream o=new ObjectInputStream(new FileInputStream(file));
            list=(List<T>) o.readObject();
            o.close();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(IOException e ){
            System.out.println(e);
        }
        return list;
    } 
    
    public static <T> void write(String file,List<T> ok){
        
        try{
            ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(ok);
            o.close();
        }catch(IOException e){
            System.out.println("co loi");
        }
    }
}
