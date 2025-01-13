import greenfoot.*;
/**
 * Write a description of class GameLevels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLevels extends World 
{
    private static int score; 
    protected static int level; 
    private static Actor scoreWork; 
    private static Actor levelWork; 
    public static Actor Rocket; 

    public GameLevels()
    {
        super(800, 600, 1); // set dimensions to largest width and height of subworlds
        
        // create the splash screen image
        GreenfootImage bg = new GreenfootImage(6, 4); // for background design
        bg.setColor(Color.DARK_GRAY);
        bg.fill();
        bg.setColor(Color.RED);
        bg.drawLine(0, 0, 5, 3);
        bg.drawLine(5, 0, 0, 3);
        setBackground(bg); // tile of background image
        // the title
        bg = getBackground(); // full background image
        GreenfootImage text = new GreenfootImage(" TITLE \nSCREEN", 180, Color.ORANGE.darker(), new Color(0, 0, 0, 0));
        int tw = text.getWidth()*3/2;
        GreenfootImage title = new GreenfootImage(tw, tw);
        title.drawImage(text, (tw-text.getWidth())/2, (tw-text.getHeight())/2);
        title.rotate(-30);
        bg.drawImage(title, (bg.getWidth()-tw)/2-20, (bg.getHeight()-tw)/2-20);
    }
    
    /**
     * 
     */
    public GameLevels(int w, int h, int c)
    {
        this(w, h, c, true);
    } 
    
    /**
     * 
     */
    public GameLevels(int w, int h, int c, boolean b)
    {
        super(w, h, c, b);
        adjustScore(0); 
        setFields();
        instructions(); 
    }
    
    
    /**
     */
    private void instructions()
    {
        String text = "Use arrow keys to move ";
        text += "";
        text += "";
        text += "";
       // GreenfootImage textImg = new GreenfootImage();
       // getBackground().drawImage();
    }
    
    /**
     *
     */
    public void startGame()
    {
        if ("Level".equals(getClass().getName()))
        {
            startOver();
        }
    }
    
    /**
 
     */
    public void startOver()
    {
        // initialize static fields in this class
        scoreWork = getNewStillActor();
        levelWork = getNewStillActor();
        Rocket = new Rocket(getWidth()/2 + 300, getHeight()/2);
        score = 0; // initialize score
        level = 0; // initialize level
        // start first world (beyond title screen)
        Greenfoot.setWorld(new SpaceOne());
    }
    
    
    /**
     * Use this class method to get the current level value from anywhere with 'Level.getLevel()';
     * DO NOT modified or remove this method
     * 
     * @return the current value of the 'level' field
     */
    public static int getLevel()
    {
        return level;
    }
    
    /**
     * Use this class method to change the score (or not) and re-display it from anywhere with 'Level.adjustScore(nn)';
     * modify the image as needed;
     * DO NOT remove this method
     *
     * @param adjustment the change in amount, if any, in the 'score' value
     */
    public static void adjustScore(int adjustment)
    {
        score += adjustment;
        //scoreText.setImage(new GreenfootImage("Score: "+score, 24, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    
    /**
     * Use this method to get the current score value from anywhere with 'Level.getScore()';
     * DO NOT modified or remove this method
     * 
     * @return the current value of the 'score' field
     */
    public static int getScore()
    {
        return score;
    }

    /**
     * Create methods in all sub-classes with this name, if needed, to assign values to additional common fields declared above;
     * DO NOT modified or remove this method
     */
    public void setFields(){} // include this method in all subclasses with appropriate code (see subclasses)
    
    /**
     * Create methods in all sub-classes with this name to transfer to the next level from that level;
     * for any actor in any level world, you may use '((Level)getWorld()).nextLevel()';
     * DO NOT modified or remove this method
     */
    public void nextLevel(){} // include this method in all subclasses with appropriate code (see subclasses)
    
    /**
     * Create methods in all sub-classes with this name to reset the current level from that level;
     * for any actor in any level world, you may use '((Level)getWorld()).resetLevel()';
     * DO NOT modified or remove this method
     */
    public void resetLevel(){} // include this method in all subclasses with appropriate code (see subclasses)
    
    /**
     * Use this class method to create and return an actor that is protected from movement commands;
     * (already used for the actors that display the score and level text)
     * DO NOT modified or remove this method
     */
    public static Actor getNewStillActor()
    {
        return new Actor()
        {
            public void setLocation(int x, int y){}
        };
    }
    
    /**
     * Demo act method: this can be removed or revised as needed; added to give all actors a downward pull;
     * (notice how score and level text fields are pinned in place)
     */
    public void act()
    {
        for (Object obj : getObjects(null))
        {
            Actor actor = (Actor)obj;
            actor.setLocation(actor.getX(), actor.getY()+1);
        }
    }
}
