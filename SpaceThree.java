import greenfoot.*; 
    public class SpaceThree extends GameLevels
{
     public int firstLevel;
     private int noAlien = 5;
     private int noAst = 10;
     private int noPlanet = 1;

    public SpaceThree() 
    {
       super(600, 400, 1); 
        setBackground(new GreenfootImage("filler"));
        
        Rocket rocket = new Rocket(getWidth()/2 + 300, getHeight()/2);
        addObject(rocket, getWidth()/2 + 300, getHeight()/2);
        
        //addAsteroids(noAst); 
         addAliens(noAlien); 
          addPlanet(noPlanet); 
    }
    public void setFields()
    {
        level = 3;
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new SpaceThree());
    }
    
    public void resetLevel()
    {
        Greenfoot.setWorld(new SpaceThree());
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
            int a = Greenfoot.getRandomNumber(getWidth()/2);
            int b = Greenfoot.getRandomNumber(getHeight()/2);
            addObject(new Alien(), a, b);
        }
    }
    private void addPlanet(int plus) 
    {
        for(int i = 0; i < plus; i++) 
        {
            int c = Greenfoot.getRandomNumber(getWidth()/2);
            int d = Greenfoot.getRandomNumber(getHeight()/2);
            addObject(new Planet(), c, d);
        }
    }
}
