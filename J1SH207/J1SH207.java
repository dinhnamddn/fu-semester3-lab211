/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh207;

import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH207 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter string: ");
        str = sc.nextLine();
        if(str.trim().matches("[a-zA-Z ]+")){
            System.out.println(secondHalfLetters(str));  
        } else{
            System.out.println("Input is invalid!");
        }
    }
    public static int secondHalfLetters(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'n' && str.charAt(i) <= 'z') {
		count++;
            }
	}
        return count;
    }
}
