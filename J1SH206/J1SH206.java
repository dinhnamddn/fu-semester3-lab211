/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh206;

import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min, max;
        min = CheckInt("Enter min:", 0, Integer.MAX_VALUE);
        max = CheckInt("Enter max:", min, Integer.MAX_VALUE);
        System.out.println("Output:");
        printSquare(min, max);
    }

    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();
        }
    }

    public static int CheckInt(String Mess, int Min, int Max) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println(Mess);
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num >= Min && num <= Max) {
                    break;
                } else {
                    System.out.println("Out of range, Please enter from " + Min + " to " + Max);
                }
            } catch (Exception e) {
                System.out.println("Invalid, accept integer number only!");
            }
        } while (true);
        return num;
    }
}
