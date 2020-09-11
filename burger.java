import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burger extends TableObject
{
    /**
     * Act - do whatever the burger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public burger()
    {
        speed = 0;
        getImage().scale(100,50);
        setRotation(0);
    }
    
    public void shoot()
    {
        mustard b = new mustard();
        b.setRotation(getRotation());
        getWorld().addObject(b,getX(),getY());
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
            speed = 4;
        else if(Greenfoot.isKeyDown("s"))
            speed = -2;
        else
            speed= 0;
            
        if(Greenfoot.isKeyDown("a"))
            turn(-4);
        else if(Greenfoot.isKeyDown("d"))
            turn(4);
            
        if(Greenfoot.isKeyDown("space"))
            shoot();
        moveTableObject();
    }    
}
