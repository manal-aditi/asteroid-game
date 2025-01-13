import greenfoot.*; 
/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World 
{
   
   public End()
    {
        super(800, 600, 1);
        // create background image
        GreenfootImage bg = new GreenfootImage(6, 4);
        bg.setColor(Color.BLACK);
       
        setBackground(bg); 
        bg = getBackground(); 
        GreenfootImage text = new GreenfootImage(" GAME \n OVER ", 180, Color.RED.darker(), new Color(0, 0, 0, 0));
        int tw = text.getWidth();
        GreenfootImage title = new GreenfootImage(tw, tw);
        //final
        text = new GreenfootImage("FINAL SCORE\n"+GameLevels.getScore(), 42, Color.BLACK, new Color(0, 0, 0, 0));
    }
    
    /** Starts a new game when the mouse is clicked while the game over screen is showing */
    public void act()
    {
        //if (Greenfoot.mouseClicked(null)) SpaceOne.startOver();
    }
}
