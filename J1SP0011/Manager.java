/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0011;

/**
 *
 * @author dinhnam_ddn
 */
public class Manager {

    public static String convertBase(int baseIn, int baseOut, String inputNum) {
        int num = otherToDec(getBase(baseIn), inputNum);
        return decToOther(getBase(baseOut), num);
    }

    public static int getBase(int n) {
        int[] a = {2, 8, 10, 16};
        return a[n - 1];
    }

    public static int otherToDec(int base, String num) {
        if (base == 10) {
            return Integer.parseInt(num);
        }
        int result = 0;
        int pow = 1;
        String index = "0123456789abcdef";
        for (int i = num.length() - 1; i >= 0; i--) {
            int n = index.indexOf(num.charAt(i));
            result += n * pow;
            pow *= base;
        }
        return result;
    }

    public static String decToOther(int base, int num) {
        String result = "";
        String index = "0123456789abcdef";
        while (num != 0) {
            int n = num % base;
            result = index.charAt(n) + result;
            num /= base;
        }
        return result;
    }
}
