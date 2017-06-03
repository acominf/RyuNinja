import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 * 
 * Clase que contiene toda la informacion de jugador
 */
public class Jugador extends Actor
{
    private int vBaja = 0;          //velocidad con la que cae el jugador
    private int vAcel = 1;          //velocidad con la que da el salto el jugador
    private int longSalto = 8;      //longitud de salto del jugador
    private int speed = 6;
    
    
    
    int direccionBala=1;            //guarda la direccion en que sale la bala 1:derecha - 2:izquierda
    boolean siBala=false;
    
    public static int score=0; //Atributo para los puntos de jugador
    public static int score1=score; //Atributo para los puntos de jugador
    
    private GreenfootImage redright2 = new GreenfootImage("redright2.png"); //Atributo que crea la imagen del jugador
    private GreenfootImage redleft2 = new GreenfootImage("redleft2.png"); //Atributo que crea la imagen del jugador
    private GreenfootSound salta = new GreenfootSound("atrapa.mp3"); //Atributo que genera el sonido cuando el jugador atrapa objetos
    
    /**
     * Metodo que utiliza todos las acciones del jugador
     */
    public void act() 
    {
        getWorld().showText("Score : ", 50, 20);
        if(Greenfoot.isKeyDown("right")){
            setImage(redright2);
            move(7);
            direccionBala = 1;
        }
        if(Greenfoot.isKeyDown("left")){
            setImage(redleft2);
            move(-7);
            direccionBala = 2;
        }
        if(Greenfoot.isKeyDown("up"))
        {
           salta();
        }
        checaPuntos();
        checaCaida();
        setBala(direccionBala);
        
    }   
    
    /**
     * Metodo que checa la fruta que toco el piso
     */
    public boolean checaItem(Class cls)
    {
        Actor actor = getOneObjectAtOffset(0, -10, cls);
        return actor != null;
    }
    
    /**
     * 
     */
    public void hapus(Class cls)
    {
        Actor actor = getOneObjectAtOffset(0, -10, cls);
        getWorld().removeObject(actor);
    }
    
    /**
     * Metodo que checa el objeto que el jugador toco, le da puntos o le resta, dependiendo del objeto
     */
    public void checaPuntos(){
        if(checaItem(Manzana.class))
        {
            hapus(Manzana.class);
            score=score+10;
            Greenfoot.playSound("masuk.mp3");
            getWorld().showText(""+score, 120, 20);
        }
        
        if(checaItem(Platano.class))
        {
            hapus(Platano.class);
            score=score+30;
            Greenfoot.playSound("masuk.mp3");
            getWorld().showText(""+score, 120, 20);
        }
        
        if(checaItem(Calavera.class))
        {
            hapus(Calavera.class);
            score=score-50;
            Greenfoot.playSound("masuk.mp3");
            getWorld().showText(""+score, 120, 20);
        }
        
        if(checaItem(Cascara.class))
        {
            hapus(Cascara.class);
            score=score-100;
            Greenfoot.playSound("masuk.mp3");
            getWorld().showText(""+score, 120, 20);
        }
       
        if(checaItem(Cereza.class))
        {
            hapus(Cereza.class);
            score=score+60;
            Greenfoot.playSound("masuk.mp3");
            getWorld().showText(""+score, 120, 20);
        }
    }
    
    /**
     * Metodo que comprueba la tecla que presione el jugador
     */
    public void checaTecla()
    {
    
        if(Greenfoot.isKeyDown("right"))
        {
            setImage(redright2);
            move(speed);
            direccionBala = 1;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setImage(redleft2);
            move(-speed);
            direccionBala = 2;
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
           salta();
        }
        
        setBala(direccionBala);
    }
    
    /**
     * Metodo que valida cuando el jugador presiona la tecla "espacio", para disparar.
     */
    public void setBala(int direccion)
    {
       if( siBala && Greenfoot.isKeyDown("space"))
       {
           Disparo bala1 = new Disparo(direccion);
           getWorld().addObject(bala1,getX(),getY());
           Greenfoot.playSound("dispara.mp3");
           siBala = false;
       }
       if(!siBala && ! Greenfoot.isKeyDown("space"))
       {
           siBala = true;
       }
    }
    
    /**
     * Metodo que hace bajar las frutas
     */
    public void caer()
    {
        setLocation ( getX(), getY() + vBaja);
        vBaja = vBaja + vAcel;
    }
    
    /**
     * Metodo que devuelve true o false cuando un objeto toca el piso.
     */
    public boolean enSuelo()
    {
        Actor piso = getOneObjectAtOffset(0, 25, Ground.class);
        return piso != null;
    }
    
    /**
     * Funcion que checa si el jugador esta en el suelo
     */
    public void checaCaida()
    {
        if(enSuelo())
        {
            vBaja = 0;
        }
        else
        {
            caer();
        }
    }
    
    /**
     * Metodo que hace bajar al jugador, cuando salta.
     */
    public void salta()
    {
        vBaja = -longSalto;
        caer();
    }
}
