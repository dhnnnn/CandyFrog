import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends Actor
{
    GreenfootSound klik = new GreenfootSound("Klik.wav");

    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            klik.play(); // SOUND saat ditekan
            getImage().scale(
                (int)Math.round(getImage().getWidth()*0.9),
                (int)Math.round(getImage().getHeight()*0.9)
            );
        }

        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(3);
            Greenfoot.setWorld(new MyWorld());
        }
    }
}