
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    int id;
    String name;
    String description;
    double vatPercent;  //As a fraction.
    double pricePerUnit;

    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, String description, double vatPercent, 
    double pricePerUnit)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.vatPercent = vatPercent;
    }
    
    public double priceBeforeTax() {
        return pricePerUnit;
    }
    
    public double priceAfterTax() {
        return priceBeforeTax() + priceBeforeTax()*vatPercent;    
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + description + priceBeforeTax() +
        priceAfterTax();
    }
}
