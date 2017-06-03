import greenfoot.*;

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 */
public class EnemigoD extends Enemigos
{
    /**
     * Constructor de la clase EnemigoD
     */
    public EnemigoD(int valor)
    {
        velBala = valor;
    }
    
    int direccionBala=1;   //guarda la direccion en que sale la bala para cada enemigo 1:derecha - 2:izq
    
    public void act() 
    {
        ataca(direccionBala,velBala);
    }
}
