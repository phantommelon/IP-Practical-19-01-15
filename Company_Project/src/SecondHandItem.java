
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
 * Represents a whole item that has been previously used.
 * 
 * SecondHandItems are given a grade to specify their quality.
 * Grades are the basis for discounting a SecondHandItem.
 * Grade 1 - 10% discount.
 * Grade 2 - 20% discount.
 * Grade 3 - 30% discount.
 * Grade 4 - 50% discount.
 * Grade 5 - 70% discount.
 * 
 * @author Alistair Madden <phantommelon@gmail.com>
 * @version 1.0
 */

public class SecondHandItem extends WholeItem
{
    
    short grade;    

    /**
     * Constructor for objects of class SecondHandItem.
     * 
     * @param id - Unique int identifier of the Item.
     * @param name - String name given to Item.
     * @param description - String description of the Item.
     * @param vatPercent - Double vat percentage of Item as a fraction (5% = 0.2).
     * @param pricePerUnit - Double price of Item.
     * @param grade - Short grade describing Item's condition.
     */
    public SecondHandItem(int id, String name, String description,
    double vatPercent, double pricePerUnit, short grade)
    {
        super(id, name, description, vatPercent, pricePerUnit);
        this.grade = grade;
    }
    
    /**
     * Gets the price before tax for the item.
     * 
     * Calls the standard priceBeforeTax, discounts based on grade
     * and returns the price.
     * 
     * @return - double - The price of the item before tax.
     */
    @Override
    public double priceBeforeTax() {
        return super.priceBeforeTax() - 
        (grade + (grade/4 + grade/5)/10.0)*super.priceBeforeTax();
    }
    
}
