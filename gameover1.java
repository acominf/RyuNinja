import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 */
public class gameover1 extends World
{
    public gameover1()
    {    
        super(640, 480, 1); 
        addObject(new helpwhite(), 416, 415);
    }
    
    /**
     * Comprueba que tecla presiona para pasar al siguiente nivel o regresar al menu principal
     */
    public void act(){
        if(Greenfoot.isKeyDown("left")){
            //Greenfoot.setWorld(new Level1());
            Greenfoot.setWorld(new gameover());
            Greenfoot.playSound("button.mp3");

        }
        if(Greenfoot.isKeyDown("enter")){
            mainstart.bgsound.stop();
            Greenfoot.setWorld(new gamehelp());
        }
    }
}
