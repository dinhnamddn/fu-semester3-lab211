/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SP0001 {         //bubble sort

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n = CheckInt("Enter number of array:", 1, Integer.MAX_VALUE);
        int[] a = new int[n];
        randomArray(a);
        bubbleSort(a);
    }

    public static void randomArray(int[] a) {
        Random rdm = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rdm.nextInt(a.length);
        }
    }

    public static void bubbleSort(int[] a) {
        display("Unsorted array", a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        display("Sorted array", a);
    }

    public static void display(String mess, int[] a) {
        System.out.print(mess + ": [");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
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