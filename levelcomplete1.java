import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 *
 * Clase que muestra que terminaste el nivel
 * */
public class levelcomplete1 extends World
{
    Jugador jug = new Jugador(); //Crea un jugador
    public levelcomplete1()
    {    
        super(640, 480, 1); 
        addObject(new nextlevel(), 414, 413);
    }
    
    /**
     * Verifica la tecla que presiones para poder pasar de nivel o regresar
     */
    public void act(){
        if(Greenfoot.isKeyDown("left")){
            Greenfoot.setWorld(new levelcomplete());
            Greenfoot.playSound("button.mp3");
        }
        if(Greenfoot.isKeyDown("enter")){
            if(jug.score==100||jug.score>=100){
                Jugador.score=0;
                Greenfoot.setWorld(new Level2());
            }
            if(jug.score1==200||jug.score1>=200){
                jug.score=0;
                Greenfoot.setWorld(new Level3());
            }
        }
    }
}
