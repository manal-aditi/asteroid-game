import greenfoot.*;
/**
 * Write a description of class Projectiles here.
 * 
 * 
 */
public class Projectiles extends Actor   
{
   
    private int health = 3;
    private static final int gunReloadTime = 5;         // The minimum delay between firing the gun.

    private int reloadDelayCount;               // How long ago we fired the gun the last time.
    private static final int damage = 16;
    
    /** A bullet looses one life each act, and will disappear when life = 0 */
    private int life = 30;
    private GreenfootImage b = new GreenfootImage("Counter.png");

    /**
     * Constructor for objects of class Projectiles
     */
    public Projectiles(int speed, int rotation)
    {
        //super(speed);
        //setRotation(rotation);
        //addForce(new Vector(rotation, 15));
        //Greenfoot.playSound("EnergyGun.wav");
        setImage(b);
    }
    
    
    
    /**
     * The bullet will damage asteroids if it hits them.
     */
    public void act()
    {
        if(life <= 0) {
            getWorld().removeObject(this);
        } 
        else {
            life--;
            move(2);
            checkAsteroidHit();
        }
    }
    
    /**
     * Check whether we have hit an asteroid.
     */
    private void checkAsteroidHit()
    {
        Asteroids asteroid = 
        (Asteroids) getOneIntersectingObject(Asteroids.class);
        if (asteroid != null){
            asteroid.hit();
            if(asteroid.getHitPoints() == 0){
                getWorld().removeObject(this);
            }
        }
    }
    private void fire() 
    {
        /*if (reloadDelayCount >= gunReloadTime) 
        {
            Bullet bullet = new Bullet (getMovement().copy(), getRotation());
            getWorld().addObject (bullet, getX(), getY());
            bullet.move ();
            reloadDelayCount = 0;
        }*/
    }
     private void shoot() 
    {
        /*if (Greenfoot.isKeyDown("space")) 
        {
            fire();
        }*/
    }
   /* private void getattacked()  
    {  
        Actor Thunderbolt;  
        Thunderbolt = getOneObjectAtOffset(0, 0, .class);  
        
      if (Thunderbolt !=null)  
      {  
        World world;  
        world = getWorld();  
        world.removeObject(Thunderbolt);  
        Greenfoot.playSound("shock.wav");  
        health -= 1;
      }
 } */
     
}