/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh201;

import java.util.Scanner;

/**
 *
 * @author dinhnam_ddn
 */
public class J1SH201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Item i1 = new Item("pho", 30, 1.5);
        Item i2 = new Item("bun", 15, 3.15);
        Item i3 = new Item("nem", 24, 6.0);
        Item i4 = new Item("cha", 18, 2.5);
        Item i5 = new Item("nuoc cham", 5, 0);
        
        
        String clerk = checkInputString("Enter clerk name: ", "[a-zA-Z ]*");
        boolean preferred = checkInputBoolean("Is preferred (Y/N): ");
        
        Employee emp = new Employee(clerk);
        DiscountBill db = new DiscountBill(emp, preferred);
        
        db.add(i1);
        db.add(i2);
        db.add(i3);
        db.add(i4);
        db.add(i5);
        
        db.printReceipt();
        System.out.println("------------------------------");
        System.out.println("Clerk: " + clerk);
        System.out.println("Total discount items: " + db.getDiscountCount());
        System.out.println("Total discount: " + db.getDiscountAmount());
        System.out.println("Discount percent: " + String.format("%.2f", db.getDiscountPercent()) + "%");
        System.out.println("Total price: " + db.getTotal() + "$");
    }
    
    public static String checkInputString(String Mess, String Regex) {
        Scanner SC = new Scanner(System.in);
	String st;
        do{
        	System.out.print(Mess);
            	st = SC.nextLine();
            	if (st.matches(Regex)) {
                	break;
        	}
            	System.out.println("Wrong input, try gain!");
        }
	while (true);
        return st;
}

    
    public static Boolean checkInputBoolean(String mess) {
        Scanner SC = new Scanner(System.in);
        String s;
        do{
            System.out.print(mess);
            s = SC.nextLine().toLowerCase();
            if (s.matches("y")) {
                return true;
            } else if (s.matches("n")) {
                return false;
            } else {
                System.out.println("Input must be Y or N, try again!");
            }
        } while (true);
    }
    
}
