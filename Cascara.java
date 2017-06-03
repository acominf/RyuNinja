import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 */
public class Cascara extends Item
{
    public void act() 
    {
        mueveObj(); //Metodo de la clase padre, que mueve los objetos hacia abajo
        checaCas(); //Metodo de la clase padre que revisa si las frutas tocan el piso
    }    
}
