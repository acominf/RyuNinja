import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 */

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 *
 * Clase que muestra que terminaste el nivel
 */
public class levelcomplete extends World
{
    Jugador jug = new Jugador(); //Variable que crea Jugador
    
    /**
     * Constructor que inicializa la ventana y muestra el menu de nivel
     */
    public levelcomplete()
    {    
        super(640, 480, 1); 
        addObject(new menulevel(), 225, 414); //Muesta el boton menu
    }
    /**
     * Comprueba que tecla presiona para pasar al siguiente nivel o regresar al menu principal
     */
    public void act(){
        if(Greenfoot.isKeyDown("right")){
            Greenfoot.setWorld(new levelcomplete1());
            Greenfoot.playSound("button.mp3");
        }
        
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new mainstart());
            jug.score=0;
            Greenfoot.delay(10);
        }
    }
}
