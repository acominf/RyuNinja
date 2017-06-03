import greenfoot.*;

/**
 *@author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase que contiene los atributos y metodos del disparo enemigo
 */
public class DisparoEne extends Disparo
{
    Level1 level1 = new Level1(); //Crea variable de tipo Level1
    Level2 level2 = new Level2(); //Crea variable de tipo Level2
    Level3 level3 = new Level3(); //Crea variable de tipo Level3
    
    /**
     * Constructor de la clase DisparoEne que usa las variables "dir" y "vel"
     * para comprobar la direccion y velocidad del disparo
     */
    public DisparoEne(int dir,int vel)
    {
        super(dir,vel);
    }
    
    /**
     * Metodo que usa los metodos de DisparoEne
     */
    public void act() 
    {
        mueveBala();
        llegaLimite();
        tocaJug();
    }  
    
    /**
     * Metodo que remueve los disparos de los enemigos al llegar al borde del escenario
     */
    public void llegaLimite()
    {
       if((getX() >= getWorld().getWidth()-5) || (getX()<=5))
       {
           getWorld().removeObject(this);
       }
    }
    
    /**
     *  Metodo que comprueba si el disparo toca al Jugador, y le quita vidas
     */
    public void tocaJug()
    {
        if (getWorld() !=null){
            
            if (isTouching(Jugador.class)){
                 level1.vidas--;
                 level2.vidas--;
                 level3.vidas--;
                 getWorld().removeObject(this);
               
            }
        }
    }
}
