
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
 * Represents an Item that may be bought in varying continuous amounts.
 * 
 * Justified by need to include unit measure in description.
 * 
 * @author Alistair Madden <phantommelon@gmail.com>
 * @version 1.0
 */
public class FractItem extends Item
{
    String unitName;

    /**
     * Constructor for objects of class FractItem.
     * 
     * @param id - Unique int identifier of the Item.
     * @param name - String name given to Item.
     * @param description - String description of the Item.
     * @param vatPercent - Double vat percentage of Item as a fraction (5% = 0.2).
     * @param pricePerUnit - Double price of Item.
     * @param unitName - String name of unit Item is to be sold in.
     */
    public FractItem(int id, String name, String description, 
    double vatPercent, double pricePerUnit, String unitName)
    {
       super(id, name, description, vatPercent, pricePerUnit);
       this.unitName = unitName;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + description + priceBeforeTax() + "/"
        + unitName + " " + priceAfterTax() + "/" + unitName;
    }
    
}
