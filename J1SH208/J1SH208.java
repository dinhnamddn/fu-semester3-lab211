/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh208;

import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        try{
            System.out.println("Enter input: ");
            input = scanner.nextInt();
            if (input > 0){
                System.out.println("After swap:");
                input = swapDigitPairs(input);
                System.out.println(input);
            } else {
                System.out.println("Input is invalid!");
            }
        } catch (Exception e){
            System.out.println("Input is invalid!");
        }
    }
    public static int swapDigitPairs(int n){
        int result = 0;
        int tmp = 1;
        while (n > 9) {
            result += tmp * 10 * (n % 10);
            n /= 10;
            result += tmp * (n % 10);
            n /= 10;
            tmp *= 100;
        }
        return result + tmp * n;
    }
    
}//23452
// 2*10*1 = 20
// 2345
// 5*1= 5 => result = 25
// tmp =100
// 234
// 4*10*100 = 4000 => result = 4025
// 23
// 3*100 = 300 => result = 4325
// 2
// 10000
// 4325+ 10000*2= 24325