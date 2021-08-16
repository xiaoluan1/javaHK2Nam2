/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exception.StringNull;
import controller.exception.ValidateException;

/**
 *
 * @author TGDD
 */
public class Ex {
    
    public static void validateNum(String num) throws ValidateException{
        if(!num.matches("^[0-9]+")) 
            throw new ValidateException(num+" không hợp lệ!");
        System.out.println(num);
    }
    
    public static void validateName(String num) throws ValidateException{
        if(!num.matches("^[A-Za-z\\s]+"))   
            throw new ValidateException(num+" không hợp lệ!");
        System.out.println(num);
    }
    
    public static void checkString(String s) throws StringNull{
        if(s.length() == 0) 
            throw new StringNull("Không được để trống!");
        System.out.println(s);
    }
}

