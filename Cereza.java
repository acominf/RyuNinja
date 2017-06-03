import greenfoot.*;

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase Cereza que da puntos al jugador
 */
public class Cereza extends Item
{
    public void act() 
    {
        mueveObj(); //Metodo de la clase padre, que mueve los objetos hacia abajo
        checaFrutas(); //Metodo de la clase padre que revisa si las frutas tocan el piso
    }    
}
