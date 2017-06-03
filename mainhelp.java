import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Metodo que muestra el menu de ayuda
 */
public class mainhelp extends World
{
    mainstart mainstart = new mainstart();
    /**
     * Constructor que detiene el sonido miestra se ve la ayuda y crea el boton ayuda
     * 
     */
    public mainhelp()
    { 
        super(640, 480, 1); 
        if(mainstart.bgsound.isPlaying()==false){
            mainstart.bgsound.playLoop();
        }
        addObject(new help(), 445, 382);
    }
    
    /**
     * Metodo que comprueba que boton escoges, ayuda o Start
     */
    public void act(){
        if(Greenfoot.isKeyDown("left")){
            Greenfoot.setWorld(new mainstart());
            Greenfoot.playSound("button.mp3");
        }
        
        if(Greenfoot.isKeyDown("enter")){
            mainstart.bgsound.stop();
           
            Greenfoot.setWorld(new gamehelp());
            Greenfoot.delay(100);
        }
    }
}
