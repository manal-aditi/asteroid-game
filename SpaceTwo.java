import greenfoot.*; 
/**
 * Write a description of class SpaceTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceTwo extends GameLevels
{
     public int firstLevel;
     private int noAlien = 5;
     private int noAst = 10;
    /**
     * Constructor for objects of class SpaceTwo
     */
    public SpaceTwo()
    {
       super(600, 400, 1); 
        setBackground(new GreenfootImage("firstback.png"));
        
        Rocket rocket = new Rocket(getWidth()/2 + 300, getHeight()/2);
        addObject(rocket, getWidth()/2 + 300, getHeight()/2);
        
        //addAsteroids(noAst); 
    }
   public void setFields()
    {
        level = 2;
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new SpaceTwo());
    }
    
    public void resetLevel()
    {
        Greenfoot.setWorld(new SpaceTwo());
    }
    /*private void addAsteroids(int count) 
    {
        for(int i = 0; i < count; i++) 
        {
            int x = Greenfoot.getRandomNumber(getWidth()/2);
            int y = Greenfoot.getRandomNumber(getHeight()/2);
            addObject(new Asteroids(), x, y);
        }
    }*/
    private void addAliens(int add) 
    {
        for(int i = 0; i < add; i++) 
        {
            int z = Greenfoot.getRandomNumber(getWidth()/2);
            int f = Greenfoot.getRandomNumber(getHeight()/2);
            
        }
    }
    
}
