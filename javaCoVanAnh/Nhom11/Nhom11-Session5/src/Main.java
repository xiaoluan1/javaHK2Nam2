
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException{
        System.out.println("Bat dau");
        int n=10/2;
        System.out.println(n);
        
            int m=10/0;
            System.out.println(m);
            String d="12/10/2020";
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
           Date dd=f.parse(d);//checked Exception
//        }catch(ParseException e){
//            System.out.println(e);
//        }catch(Exception e){
//            System.out.println(e);
//        }finally{
//            System.out.println("luon luon viet ra");
//    }
        
        
////        System.out.println("cai gi day 1");
////        System.out.println("cai gi day 2");
//        
//        
//            
        
    }
}
