import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hungryant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hungryant extends TableObject
{
    /**
     * Act - do whatever the hungryant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public hungryant()
    {
        getImage().scale(20,20);
    }
        
    public void act() 
    {
        // Add your action code here.
        moveTableObject();
        
        Actor a = getOneIntersectingObject(burger.class);
        if(a != null)
        {
            getWorld().removeObject(a);
           
        }
    }    
}
