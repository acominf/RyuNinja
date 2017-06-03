import greenfoot.*;

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase que Contiene los metodos y atributos del disparo del jugador
 */
public class Disparo extends Actor
{
    int vBala = 5;          //Velocidad con la que se mueve la bala 
    int dirBala;            //Sele guarda la direccion que le manda la clase jugador
    
    /**
     * Constructor de Disparo, agrega la direccion de la bala
     */
    public Disparo(int direcc)
    {
        dirBala = direcc;
    }
    
    /**
     * Constructor que guarda la velocidad de la bala del
     */
    public Disparo(int direcc, int veloc)
    {
        dirBala = direcc;
        vBala = veloc;
    }
    
    /**
     * Metodo que mandar llamar los metodos de la clase Disparo
     */
    public void act() 
    {
        mueveBala(); 
        if (getWorld() ==null) return;
            tocaEneD();
        if (getWorld() ==null) return;
            AtWorldEdge();
        if (getWorld() ==null) return;
            atWorldEdge();
        if (getWorld() ==null) return;
            tocaEneI();
    }    
    
    /**
     * Metodo que mueve la bala a la derecha o izquieda
     */
    public void mueveBala()
    {
        switch(dirBala)
        {
            case 1: setLocation(getX()+vBala, getY());
                    break;
                    
            case 2: setLocation(getX()-vBala, getY());
                    break;
        }   
    }
    
    /**
     * Metodo que remueve los disparos del jugador y de los enemigos, cuando tocan el borde
     * del escenario
     */
    public void AtWorldEdge()
    {
        if(atWorldEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Metodo que regresa true o false 
     */
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() -5)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() -5)
            return true;
            else
            return false;
    }
    
    /**
     * Metodo que comprueba si toca al enemigo de la derecha
     */
    public void tocaEneD()
    {
        EnemigoD zombie = (EnemigoD)getOneIntersectingObject(EnemigoD.class);
        if (zombie != null)
        {
            //Nivel1 espacio = (Nivel1)getWorld();
            getWorld().removeObject(zombie);
            getWorld().removeObject(this); 
            //System.out.println("Shot");
            //System.out.println(zombie.getHealth());
        }
    }
    
    
   /**
     * Metodo que comprueba si toca al enemigo de la izquierda
     */
    public void tocaEneI()
    {
        EnemigoI sprinter = (EnemigoI)getOneIntersectingObject(EnemigoI.class);
        if (sprinter != null)
        {
            //Nivel1 espacio = (Nivel1)getWorld();
            getWorld().removeObject(sprinter);
            getWorld().removeObject(this); 
            //sprinter.setHealth(-1);
        }
    }
}
