
/**
 * Write a description of class Basket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.HashMap;

public class Basket
{
    HashMap<Item, Number> basket;

    /**
     * Constructor for objects of class Basket
     */
    public Basket()
    {
        basket = new HashMap<>();
    }
    
    public void addItem(int quantity, WholeItem item) {
        
        if(basket.keySet().contains(item)) {
            int newQuantity = basket.get(item).intValue() + quantity;
            basket.put(item, newQuantity);
        }
        
        else {
            basket.put(item, quantity);
        }
    }
    
    public void addItem(double quantity, FractItem item) {
        
        if(basket.keySet().contains(item)) {
            double newQuantity = basket.get(item).doubleValue() + quantity;
            basket.put(item, newQuantity);
        }
        
        else {
            basket.put(item, quantity);
        }
    }
    
    public double totalPriceBeforeTax() {
        
        double price = 0.0;
        
        for(Item item : basket.keySet()) {
            price += basket.get(item).doubleValue()*item.priceBeforeTax();
        }
        
        return price;
    }
    
     public double totalPriceAfterTax() {
        
        double price = 0.0;
        
        for(Item item : basket.keySet()) {
            price += basket.get(item).doubleValue()*item.priceBeforeTax();
        }
        
        return price;
    }
}
