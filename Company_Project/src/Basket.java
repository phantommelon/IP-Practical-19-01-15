
/*
 * Copyright 2015 Alistair Madden <phantommelon@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Represents a customer's virtual shopping Basket.
 * 
 * Basket class contains methods to add and remove items, and also to get the
 * total cost of all items in the basket, both before and after tax.
 * 
 * @author Alistair Madden <phantommelon@gmail.com>
 * @version 1.0
 */

import java.util.HashMap;

public class Basket
{
    
    //May be better to take all numbers of items in as double values.
    HashMap<Item, Number> basket;

    /**
     * Constructor for objects of class Basket.
     * 
     * Initialises an empty HashMap to serve as the basket.
     */
    public Basket()
    {
        basket = new HashMap<>();
    }
    
    //Add boundary conditions. Supply separate method for removal.
    /**
     * Adds the specified WholeItem to the Basket.
     * 
     * @param item - The WholeItem to be added to the Basket.
     * @param quantity - int to specify the number of the item to add. 
     */
    public void addItem(WholeItem item, int quantity) {
        
        if(basket.keySet().contains(item)) {
            int newQuantity = basket.get(item).intValue() + quantity;
            basket.put(item, newQuantity);
        }
        
        else {
            basket.put(item, quantity);
        }
    }

    /**
     * Adds the specified FractItem to the Basket.
     * 
     * @param item - The FractItem to be added to the Basket.
     * @param quantity - Double to specify the amount of the item to add. 
     */
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
