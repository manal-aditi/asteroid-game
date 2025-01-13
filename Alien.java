import greenfoot.*;
/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends MovingObjects
 {
    int firstLevel = 0;
    private int health = 3; 
     private GreenfootImage alien = new GreenfootImage("alien.png");
     public Alien()
    {
        super(new Vector(Greenfoot.getRandomNumber(360), 2));
        setImage(alien);
    }
    
    public Alien(int size, Vector speed)
    {
        super(speed);
    }
     
 
  public boolean loseLife(int amount)
  {
    health -= amount;
    if (health < 1)
    {
        getWorld().removeObject(this);
        return true;
    }
    return false;
  }
    public void keyPress() {
         if (Greenfoot.isKeyDown("left")) 
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
    }
    
}
