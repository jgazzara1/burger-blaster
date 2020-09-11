import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ketchup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mustard extends TableObject
{
    /**
     * Act - do whatever the ketchup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int range;
    public mustard()
    {
            speed = 8;
            range = 40;
            getImage().scale(40,20);
    }
    public void act() 
    {
        // Add your action code here.
        moveTableObject();
        
        range = range - 1;
        if(range <= 0)
        {
            getWorld().removeObject(this);
            return;
        }
        
        Actor a = getOneIntersectingObject(hungryant.class);
        if(a != null)
        {
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }    
    } }     
