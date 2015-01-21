
/**
 * Write a description of class WholeItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondHandItem extends WholeItem
{
    
    short grade;    

    /**
     * Constructor for objects of class WholeItem
     */
    public SecondHandItem(int id, String name, String description,
    double vatPercent, double pricePerUnit, short grade)
    {
        super(id, name, description, vatPercent, pricePerUnit);
        this.grade = grade;
    }
    
    @Override
    public double priceBeforeTax() {
        return super.priceBeforeTax() - 
        ((grade/4 + grade/5)/10)*super.priceBeforeTax();
    }
    
}
