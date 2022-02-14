/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh201;

/**
 *
 * @author dinhnam_ddn
 */
public class Item {

    private String name;
    private double price;
    private double discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", price: " + price + "$, discount: " + discount + "%";
    }

}
