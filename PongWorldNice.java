import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PongWorldNice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongWorldNice extends World
{

    /**
     * Constructor for objects of class PongWorld.
     * 
     */
    public PongWorldNice()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1440, 900, 1);
        populate();
    }
   
    public void populate()
    {
        addObject(new Ball(),getWidth()/2,getHeight()/2);
        addObject(new HumanPlatform(),getWidth()-50,getHeight()/2);
        addObject(new AIPlatform(),57,getHeight()/2);
        addObject(new TopBorder(),getWidth()/2 , getHeight()/2);
    }
}

