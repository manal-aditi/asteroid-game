import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 */
public abstract class MovingObjects extends Actor
{
    private Vector movement;
    private double coX;
    private double coY;
    
    private int damage;
    private int attack;
    
    private Score scoreBoard = null;
    
    public MovingObjects()
    {
        this(new Vector());
    }
    
    
    public MovingObjects(Vector movement)
    {
        this.movement = movement;
    }
    
    
    /**
     * Set the location from exact coordinates.
     */
    public void setLocation(double x, double y) 
    {
        coX = x;
        coY = y;
        super.setLocation((int) x, (int) y);
    }
    
    
    public void setLocation(int x, int y) 
    {
        coX = x;
        coY = y;
        super.setLocation(x, y);
    }

    /**
     * Return the exact x-coordinate (as a double).
     */
    public double getExactX() 
    {
        return coX;
    }

    /**
     * Return the exact y-coordinate (as a double).
     */
    public double getExactY() 
    {
        return coY;
    }

    /**
     * Increase the speed with the given vector.
     */
    public void addForce(Vector force) 
    {
        movement.add(force);
    }
    
    /**
     */
    public void speedge(double factor)
    {
        movement.scale(factor);
        if (movement.getLength() < 0.15) {
            movement.setNeutral();
        }
    }
    
    /**
     * Return the speed of this actor.
     */
    public double getSpeed()
    {
        return movement.getLength();
    }
    
    /**
     * Stop movement of this actor.
     */
    public void stop()
    {
        movement.setNeutral();
    }
    
    /**
     * Return the current speed.
     */
    public Vector getMovement() 
    {
        return movement;
    }
}
