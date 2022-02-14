/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh201;

import java.util.ArrayList;

/**
 *
 * @author dinhnam_ddn
 */
public class GroceryBill {
    
    private Employee clerk;
    private ArrayList<Item> list = new ArrayList<Item>();
    private double total = 0;
    
    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
    }
    
    public void add(Item i) {
        list.add(i);
        total += i.getPrice();
    }
    
    public double getTotal() {
        return total;
    }
    
    public void printReceipt() {
        System.out.println("List of items: ");
        for (Item x: list) {
            System.out.println(x.toString());
        }
    }
}
