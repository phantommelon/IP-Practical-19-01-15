
/**
 * Write a description of class VideoGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VideoGame extends Item
{
    // instance variables - replace the example below with your own
    private int ageRating;

    /**
     * Constructor for objects of class VideoGame
     */
    public VideoGame(String title, int time, int ageRating)
    {
        super(title, time);
        this.ageRating = ageRating;
    }

    /**
     * Prints the VideoGame's details.
     */
    public void print() {
        super.print();
        System.out.println("age rating: " + ageRating);
    }
}
