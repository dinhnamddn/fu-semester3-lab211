/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh210;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH210 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) {
        try {
            Scanner inputs = new Scanner(new File("input.txt"));
            flipLines(inputs);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
            return;
        }
    }

    public static void flipLines(Scanner input) {
        if (!input.hasNext()) {
            System.out.println("File is empty!");
            return;
        }
        ArrayList<String> arrl = new ArrayList<>();
        while (input.hasNextLine()) {
            arrl.add(input.nextLine());
        }
        for (int i = 0; i < arrl.size(); i += 2) {
            if (i == arrl.size() - 1) {
                System.out.println(arrl.get(i));
                break;
            } else {
                System.out.println(arrl.get(i + 1));
                System.out.println(arrl.get(i));
            }
        }
        input.close();
    }
}