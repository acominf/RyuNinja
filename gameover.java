import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase que muestra el mensaje "gameover"
 */
public class gameover extends World
{
    Level1 level1 = new Level1();

    public gameover()
    {    
        super(640, 480, 1); 
        addObject(new tryagain(), 227, 414);
    }
    
    /**
     * Comprueba que tecla presiona para pasar al siguiente nivel o regresar al menu principal
     */
    public void act(){
        if(Greenfoot.isKeyDown("right")){
            //Greenfoot.setWorld(new gamehelp());
            Greenfoot.setWorld(new gamehelp());
            Greenfoot.playSound("button.mp3");
        }
        
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Level1());
            level1.vidas=3;
            Jugador.score=0;
            mainstart.bgsound.stop();
        }
    }
}
