
/**
 * Write a description of class FractItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractItem extends Item
{
    String unitName;

    /**
     * Constructor for objects of class FractItem
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
