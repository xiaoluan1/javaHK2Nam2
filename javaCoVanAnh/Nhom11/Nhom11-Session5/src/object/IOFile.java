
package object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
public class IOFile {
    //doc tu file
    public static <T> List<T> read(String file){
        List<T> list=new ArrayList<>();
        try{
            ObjectInputStream o=new 
               ObjectInputStream(new 
                     FileInputStream(file));
            list=(List<T>)o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    //viet vao file
    public static <T> void write(String file,
                  List<T> arr){
        try{
            ObjectOutputStream o=new 
                ObjectOutputStream(new 
                    FileOutputStream(file));
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
