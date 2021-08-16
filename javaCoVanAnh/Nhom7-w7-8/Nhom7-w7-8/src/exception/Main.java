/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void validateID(String id)
            throws ValidateException{
     if(!id.matches("^[Bb]{1}\\d{2}[A-Za-z]{4}\\d{3}$"))                          
     throw new ValidateException("ID "+id+" not valid");
        System.out.println(id);
    }
    public static void main(String[] args) {
        //java.util.Date d=new java.util.Date();
//        System.out.println("bat dau ct");
//        int a=4;
//        int b=0;
//        try{
//           int c=a/b;
//           System.out.println(c);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("viec 1");
//        System.out.println("viec 2");
          //unchecked exception
          try{
          String num="56";
          int n=Integer.parseInt(num);System.out.println(n);
          //checked exception
          String sd="21/1/20202";
          SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
          //try{
             Date d=f.parse(sd);
//          }catch(ParseException e){
//              System.out.println(e);
//          }
          }catch(Exception e){
              System.out.println(e);
          }
          finally{
              System.out.println("luon luon thuc hien");
          }
          try{
             validateID("B18CkjkkNCQ123");
             
          }catch(ValidateException e){
              System.out.println(e);
          }
    }
}
class ValidateException extends        
        Exception {
 public ValidateException(String message){
      super(message);
  }    
}