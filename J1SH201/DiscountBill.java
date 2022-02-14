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
public class DiscountBill extends GroceryBill{
    private int discountItem = 0;
    private double discount = 0;
    private boolean preferred;

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }
    
    @Override
    public void add(Item i) {
        super.add(i);
        if (preferred == true && i.getDiscount() > 0) {
            discountItem++;
            discount += i.getDiscount();
        }
    }
    
    public int getDiscountCount() {
        return discountItem;
    }
    
    public double getDiscountAmount() {
        return discount;
    }
    
    @Override
    public double getTotal() {
        return super.getTotal() - discount;
    }
    
    public double getDiscountPercent() {
        return discount / super.getTotal() * 100;
    }
}
