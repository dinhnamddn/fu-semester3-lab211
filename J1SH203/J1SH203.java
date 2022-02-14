/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh203;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while(str.trim().isEmpty()){
            System.out.println("Enter String: ");
            str = scanner.nextLine();
        }
        str = upperFirstChar(printReverse(str));
        System.out.println(str);
        
    }
    public static String printReverse(String str){
        String[] tmp = str.split("\\s+");
        String result = "";
        for (String temp1 : tmp) {
            result = " " + temp1 + result;
        }
        return result.trim();
    }
    public static String upperFirstChar(String str){
        StringBuilder newstr = new StringBuilder(str);
        newstr.setCharAt(0, Character.toUpperCase(newstr.charAt(0)));
        return newstr.toString();
//        char[] array = str.toCharArray();
//        array[0] = Character.toUpperCase(array[0]);
//        return new String(array);
    }
}
