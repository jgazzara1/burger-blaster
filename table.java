import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class the_void here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class table extends World
{
    public int counter;
    /**
     * Constructor for objects of class the_void.
     * 
     */
    public table()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
    }
    
    public void act() 
    {
        // Add your action code here.
        if(counter == 0)
        {
            hungryant a = new hungryant();
            addObject(a, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            
            counter = 200;
        }
        counter = counter - 1;
    }    
}
