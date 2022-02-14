/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh211;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = checkInt("Enter size of array: ", 2, Integer.MAX_VALUE);
        int m = 0;
        Random random = new Random();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            int x;
            if (i % 2 == 0) {
                x = random.nextInt(10);
                m += x;
            } else {
                x = random.nextInt(10) - random.nextInt(10);
            }
            arr1[i] = x;
        }
        
//        display("Input: ", arr1);
//        ArrayIntList list = new ArrayIntList(arr1, n);
//        int[] arr2 = list.fromCounts(m);
//        display("Output: ", arr2);
        
        ArrayIntList list = new ArrayIntList(arr1, n);
        display("Input: ", list);
        ArrayIntList list2 = list.fromCounts(m);
        display("Output: ", list2);
    }
    
    public static void display(String mess, ArrayIntList list) {
        System.out.print(mess);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.getElementData()[i] + " ");
        }
        System.out.println();
    }

    public static int checkInt(String Mess, int Min, int Max) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print(Mess);
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num >= Min && num <= Max && num % 2 == 0) {
                    break;
                } else {
                    System.out.println("Size of array must be a positive even number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid, accept integer number only!");
            }
        } while (true);
        return num;
    }
}