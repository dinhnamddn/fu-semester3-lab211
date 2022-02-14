/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0020;

import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SP0020 {     //selection sort

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n = CheckInt("Enter number of array: ", 1, Integer.MAX_VALUE);
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = CheckInt("Enter a[" + i + "]: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        selectionSort(a);
    }

    public static void selectionSort(int[] a) {
        display("Unsorted array", a);
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    min = j;
                }
            }
            if (min == i) {
                continue;
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
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
            System.out.print(Mess);
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