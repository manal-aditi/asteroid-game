 import greenfoot.*;
 import java.util.*;
/**
 * create precise co-ordinates
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroids extends MovingObjects  
{
    private int maxHeight;
    private int hitpoints;
    private GreenfootImage asteroid = new GreenfootImage("images/asteroid.jpg");
    public Asteroids(int y, int x, int maxY )
    {
        setImage(asteroid);
        maxHeight = maxY;
        setLocation(y, x);
        setSize(50);
        hitpoints = 100;
 
    }
    
    public Asteroids(int size)
    {
        super(new Vector(Greenfoot.getRandomNumber(360), 2));
        setSize(size);
    }
    
 
    public void hit(){
        
     hitpoints -= 20;   
    }
    
    public int getHitPoints(){
        
     return hitpoints;   
    }
    public void act()
    {         
       //setRotation(90);
        /*while(getExactY() != maxHeight){
            move(5);
        }*/
    }
    public void getCoordinates() {
        
     }
   
    
   
    /**
     * Set the size of this asteroid. Note that stability is directly
     * related to size. Smaller asteroids are less stable.
     */
    public void setSize(int size) 
    {
        int stability = size; 
        size = size;
        GreenfootImage image = getImage();
        image.scale(size, size);
    }

    
   
    
}
