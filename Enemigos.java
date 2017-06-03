import greenfoot.*;

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase padre de los enemigos del juego
 */
public class Enemigos extends Actor
{
    int direccionBala=1;   //guarda la direccion en que sale la bala para cada enemigo 1:derecha - 2:izq
    int velBala = 3; // Atributo para la velocidad de los disparos
    boolean siBala=false; //Atributo para indicar true o false de las balas
    
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
    }    
    
    /**
     * Metodo que dibuja el disparo en la direccion recibida
     */
    public void ataca(int direccion,int veloc)
    {
       if( siBala && Greenfoot.getRandomNumber(400)<1)
       {
           DisparoEne bala1 = new DisparoEne(direccion,veloc);
           getWorld().addObject(bala1,getX(),getY());
           Greenfoot.playSound("dispara1.mp3");
           siBala = false;
       }
       if(!siBala)
       {
           siBala = true;
       }
    }
}
