import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platforms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platforms extends Bouncer
{
    public int ySpeed = 7;
    /**
     * Act - do whatever the Platforms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void KeyBoard()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()- ySpeed);     
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+ ySpeed);  
        }
    }
    }
