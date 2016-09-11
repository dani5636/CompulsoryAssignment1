import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    public int xSpeed = -7;
    public int ySpeed = 7;
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+ xSpeed, getY()+ ySpeed);
        bounceFromEdge();
        // Add your action code here.
    }    
    public void bounceFromEdge() 
    {
    if (getY()<=50|| getY()>= getWorld().getHeight()-16)
    {
        ySpeed = - ySpeed;
    }
    HumanPlatform Player1 = (HumanPlatform)getOneIntersectingObject(HumanPlatform.class);
    if (Player1 != null)
    {
        xSpeed = - xSpeed;
    }
    AIPlatform CPU = (AIPlatform)getOneIntersectingObject(AIPlatform.class);
    if (CPU != null)
    {
        xSpeed = - xSpeed;
    }
    
}
}
