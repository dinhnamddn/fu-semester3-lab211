/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh202;

import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter String: ");
        str = scanner.nextLine();
        if (!str.trim().isEmpty()){
            str = printReverse(str);
            System.out.println(str);
        }
    }
    public static String printReverse(String str){
        String[] tmp = str.split("");
        String result = "";
        for (String temp1 : tmp) {
            result = temp1 + result;
        }
        return result.trim();
    }
}
