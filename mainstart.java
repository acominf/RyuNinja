import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase que muestra el menu principal del juego
 */
public class mainstart extends World
{
    public static GreenfootSound bgsound = new GreenfootSound("fondo.mp3"); //Variable que ejecuta el sonido de juego
    /**
     * Constructor que agrega el boton Start
     * 
     */
    public mainstart()
    {    
        super(640, 480, 1); 
        addObject(new start(), 195, 383);
        /*if(bgsound.isPlaying()==false){
            bgsound.playLoop();
        }*/
    }
    
    /**
     * Metodo que verifica si das click en Start o en Help
     */
    public void act(){
        if(Greenfoot.isKeyDown("right")){
            Greenfoot.setWorld(new mainhelp());
            Greenfoot.playSound("button.mp3");
        }
        if(Greenfoot.isKeyDown("enter")){
            bgsound.pause();
            bgsound.stop();
            Greenfoot.setWorld(new Level1());
        }
    }
}
