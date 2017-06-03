import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gamehelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gamehelp extends World
{
    mainstart mainstart = new mainstart();
    /**
     * Constructor for objects of class gamehelp.
     * 
     */
    public gamehelp()
    {    
        super(640, 480, 1); 
        if(mainstart.bgsound.isPlaying()==false){
            mainstart.bgsound.playLoop();
        }
    }
    public void act(){
        if(Greenfoot.isKeyDown("backspace")){
            mainstart.bgsound.stop();
            Greenfoot.setWorld(new mainstart());
        }
        if(Greenfoot.isKeyDown("enter")){
            mainstart.bgsound.stop();
            Greenfoot.setWorld(new mainstart());
            Greenfoot.delay(10);
        }
    }
}
