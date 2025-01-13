import greenfoot.*;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Counter
{
    

    /**
     * Constructor for objects of class Score
     */
    public Score()
    {
    }
    
      public void addScore(int score) {
     if (!getWorld().getObjects(Counter.class).isEmpty()) {
         getWorld().getObjects(Counter.class).get(0).add(score);
     }
   }
}
