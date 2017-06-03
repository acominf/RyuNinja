import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase padre de las frutas que aparecen en los juegos
 */
public class Item extends Actor
{
    Level1 level1 = new Level1(); //Crea variable de tipo Level1
    Level2 level2 = new Level2(); //Crea variable de tipo Level2
    Level3 level3 = new Level3(); //Crea variable de tipo Level3
    public void act() 
    {
       
       
    }
    
    /**
     * Metodo que mueve los objetos hacia abajo 
     */
    public void mueveObj(){
        setLocation(getX(), getY()+2); 
    }  
    
    /**
     * Metodo revisa si las frutas tocan el suelo, y le quitan vidas al jugador
     */
    public void checaFrutas()
    {
        if (getWorld() !=null){
             if (getY()>=getWorld().getHeight()-1){
                 level1.vidas--;
                 level2.vidas--;
                 level3.vidas--;
                 getWorld().removeObject(this);
                }
        }
    }
    
    /**
     * Metodo que comprueba si un objeto de tipo Cascara, toca el piso, ya que estos no quitan
     * vidas al jugador, solo puntos si los toca
     */
    public void checaCas()
    {
        if (getWorld() !=null){
             if (getY()>=getWorld().getHeight()-1){
                 getWorld().removeObject(this);
                }
        }
    }

}
