import greenfoot.*;
/**
 * Write a description of class Planets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planet extends MovingObjects
{
    // instance variables - replace the example below with your own
    
   private GreenfootImage planet = new GreenfootImage("planet.jpeg");
    /**
     * Constructor for objects of class Planets
     */
    public Planet()
    {
        setImage(planet);
    }
        public void keyPress() {
         if (Greenfoot.isKeyDown("left")) 
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-3);
        }
    }
    
}
