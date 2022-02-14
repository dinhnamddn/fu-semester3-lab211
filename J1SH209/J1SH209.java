/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner inputs = new Scanner(new File("input.txt"));
            countCoins(inputs);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
            return;
        }
    }

    public static void countCoins(Scanner input) {
        if (!input.hasNext()) {
            System.out.println("File is empty!");
            return;
        }
        double totalCoints = 0;
        double quantity;
        while (input.hasNext()) {
            String coin = input.next();
            try {
                quantity = Double.parseDouble(coin);
            } catch (NumberFormatException e) {
                System.out.println("Invalid data. Please check your data.");
                return;
            }
            String type = input.next().toLowerCase();
            if (type.equals("pennies")) {
                totalCoints += quantity;
            } else if (type.equals("nickels")) {
                totalCoints += 5 * quantity;
            } else if (type.equals("dimes")) {
                totalCoints += 10 * quantity;
            } else if (type.equals("quarters")) {
                totalCoints += 25 * quantity;
            }
        }

        System.out.println("Total money: $" + String.format("%.2f", totalCoints / 100));
        input.close();
    }
}
