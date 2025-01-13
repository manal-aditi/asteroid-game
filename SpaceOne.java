import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceOne extends GameLevels
{
     public int firstLevel;
     private int noAlien = 5;
     private int noAst = 10;
     public Asteroids asteroids[];
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private ArrayList<Asteroids> asteroidsList;
    public SpaceOne()
    {    
          
       // super(600, 400, 1); 
        setBackground(new GreenfootImage("firstback.png"));
        
        Rocket rocket = new Rocket(getWidth()/2 + 300, getHeight()/2);
        
        
        addObject(rocket,getWidth()/2 + 100, getHeight()/2 +100 );
        
       // rocket.setLocation(getWidth() /2, getHeight() /2); 
        asteroidsList = new ArrayList<>();
        
        Random r = new Random();
        int low = 10;
        int high = getWidth();
        int result = 0;
        
        for(int i = 0; i < 5; i++){
            
         int y = 10;
         int x = r.nextInt(high-low) + low;
         Asteroids a = new Asteroids(y, x, getHeight());
         addObject(a, x, y);
         asteroidsList.add(a);
        }
      
    }
    public void setFields()
    {
        level = 1;
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new SpaceTwo());
    }
    
    public void resetLevel()
    {
        Greenfoot.setWorld(new SpaceOne());
    }
    
    
   public void levelOnePass() {
     if (getObjects(Asteroids.class).isEmpty()) {
        Greenfoot.setWorld(new SpaceTwo()); 
     } 
   
   }
}
