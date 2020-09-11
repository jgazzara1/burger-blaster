import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableObject extends Actor
{
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed;
    public TableObject()
    {
        speed = 2;
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    
    
    public void moveTableObject()
    {
        move(speed);
        
        int width = getWorld().getWidth();
        if(getX() < 5)
            setLocation(width-5, getY());
        if(getX() > width-5)
            setLocation(5, getY());
      
        int height = getWorld().getHeight();
        if(getY() < 5)
            setLocation(getX(), height-5);
        if(getY() > height-5)
            setLocation(getX(), 5);
    }
    
    
}
