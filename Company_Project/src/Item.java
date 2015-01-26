
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
 * Represents a generic Item.
 * 
 * Superclass of all Item classes.
 * Cannot be instantiated itself - Items are either WholeItems or FractItems.
 * 
 * @author Alistair Madden <phantommelon@gmail.com>
 * @version 1.0
 */
public abstract class Item
{
    int id;
    String name;
    String description;
    double vatPercent;  //As a fraction, ie 5% = 0.2.
    double pricePerUnit;

    /**
     * Constructor for objects of class Item.
     * 
     * @param id - Unique int identifier of the Item.
     * @param name - String name given to Item.
     * @param description - String description of the Item.
     * @param vatPercent - Double vat percentage of Item as a fraction (5% = 0.2).
     * @param pricePerUnit - Double price of Item.
     */
    public Item(int id, String name, String description, double vatPercent, 
    double pricePerUnit)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.vatPercent = vatPercent;
    }
    
    /**
     * Gets the price before tax for the given Item.
     * 
     * Determines the price of the Item from its pricePerUnit.
     * 
     * @return - double - The price of the item before tax.
     */
    public double priceBeforeTax() {
        return pricePerUnit;
    }
    
    /**
     * Gets the price after tax for the given Item.
     * 
     * Determines the price of the Item from its priceBeforeTax and vatPercent.
     * 
     * @return - double - The price of the item before tax.
     */
    public double priceAfterTax() {
        return priceBeforeTax() + priceBeforeTax()*vatPercent;    
    }
    
    /**
     * Gives a description of the current Item.
     * 
     * @return - String - a String containing useful information about the Item.
     */
    @Override
    public String toString() {
        return id + " " + name + " " + description + priceBeforeTax() +
        priceAfterTax();
    }
    
}
