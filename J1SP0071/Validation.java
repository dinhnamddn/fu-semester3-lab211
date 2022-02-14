/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class Validation {

    private static final Scanner SC = new Scanner(System.in);

    public static Integer checkInt(String Mess, int Min, int Max, String ignore) {
        int num;
        String s;
        do {
            System.out.print(Mess);
            try {
                s = SC.nextLine();
                if (s != null && s.trim().equalsIgnoreCase(ignore)) {
                    return null;
                }
                num = Integer.parseInt(s);
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

    public static Double checkDouble(String mess, double min, double max, String ignore) {
        double num;
        String s;
        do {
            System.out.println(mess);
            try {
                s = SC.nextLine();
                if (s != null && s.trim().equalsIgnoreCase(ignore)) {
                    return null;
                }
                num = Double.parseDouble(s);
                if (num >= min && num <= max && num % 0.5 == 0) {
                    break;
                } else {
                    System.out.println("Out of range, Please enter from " + min + " to " + max);
                }
            } catch (Exception e) {
                System.out.println("Invalid, accept double number only!");
            }
        } while (true);
        return num;
    }

    public static String checkInputString(String Mess, String Regex, String ignore) {
        String s;
        do {
            System.out.println(Mess);
            s = SC.nextLine();
            if (s != null && s.trim().equalsIgnoreCase(ignore)) {
                    return null;
                }
            if (s.matches(Regex)) {
                break;
            }
            System.out.println("Wrong input, try gain!");
        } while (true);
        return s;
    }

    public static Date checkDate(String Mess, String format, String ignore) {
        Date date;
        String d;
        SimpleDateFormat SD = new SimpleDateFormat(format);
        SD.setLenient(false);
        do {
            System.out.print(Mess);
            try {
                d = SC.nextLine().trim();
                if (d != null && d.equalsIgnoreCase(ignore)) {
                    return null;
                }
                date = SD.parse(d);
                break;
            } catch (Exception e) {
                System.out.println("Wrong input, please enter date by following: '" + format + "'");
            }
        } while (true);
        return date;
    }
}
