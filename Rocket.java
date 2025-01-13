
import greenfoot.*;
/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    // instance variables - replace the example below with your own
    
    private int health = 100; 
    private GreenfootImage rocket = new GreenfootImage("rocket.png");
    
    private int x;
    private int y;
    
    /**
     * Constructor for objects of class Rocket     */
    public Rocket(int x, int y)
    {
        setImage(rocket);
        this.x = x;
        this.y = y;
       
    }
     
    public int crash(Asteroids asteroid) {
        if (this.intersects(asteroid)) {
            health -= 10;
        }
        return -1;
    }
    
    public void act() {
        //Check if a key is press
        keyPress();
        
    }
    
    public void fireBullet(){
        
        Projectiles p = new Projectiles(5, 90);
        getWorld().addObject(p, x, y);
    }
    
    
    public boolean crash(){
        
        Asteroids asteroid = 
        (Asteroids) getOneIntersectingObject(Asteroids.class);
        
        if(asteroid != null){
            return true;
        }
        
        return false;
        
    }
    
    public boolean canShoot(){
        
        //Do Timer Thing Here
        return true;
        
    }
    
     public void keyPress() {
        if(Greenfoot.isKeyDown("right")) { 
           setRotation(0); 
           move(5);
           x += 5;
        } 
        if(Greenfoot.isKeyDown("down")) 
        { 
           setRotation(90); 
           move(5); 
           y -=5;
        } 
        if(Greenfoot.isKeyDown("left")) 
        { 
           setRotation(180); 
           move(5); 
           x -= 5;
        } 
        if(Greenfoot.isKeyDown("up")) 
        { 
           setRotation(270); 
           move(5); 
           y += 5;
        } 
        if(Greenfoot.isKeyDown("space")){
            
            if(canShoot()){
              fireBullet();
            }
            
        }
    }
    
    
}
