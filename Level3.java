import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 */
public class Level3 extends World
{
    static int vidas=3; //Variable para las vidas del jugador
    
    Vida1 vida1 = new Vida1(); //Crea el objeto Vida1
    Vida2 vida2 = new Vida2(); //Crea el objeto Vida2
    Vida3 vida3 = new Vida3(); //Crea el objeto Vida3
    Jugador jug = new Jugador(); //Crea un objeto Jugador
    mainstart mainstart = new mainstart(); //Crea un objeto menuinicial
    EnemigoD eneDniv1 = new EnemigoD(12); //Crea el enemigo de la derecaha
    EnemigoI eneIniv2 = new EnemigoI(12); //Crea el enemigo de la Izquierda
    
    /**
     * Constructor que dibuja todo el escenario del nivel 3
     */
    public Level3()
    {    
        super(900, 600, 1); 
        
        addObject(vida1, 610 , 20); //Agrega el objeto Vida1 al escenario
        addObject(vida2, 580 , 20); //Agrega el objeto Vida2 al escenario
        addObject(vida3, 550 , 20); //Agrega el objeto Vida3 al escenario
        
        addObject(new Ground(), 100,680); //Agrega un objeto piso para el escenario
        addObject(new Ground(), 400,680); //Agrega un objeto piso para el escenario
        addObject(new Ground(), 700,680); //Agrega un objeto piso para el escenario
        
        addObject(new Jugador(), getWidth()/2 , 390); //Agrega al jugador en el centro del escenario
    }
    
    /**
     * Metodo que se encarga de ejecutar los metodos de la clase
     */
    public void act(){        
        generaItem();
        restaVid();
        nextlevel(300);
        showText("Level 3",getWidth()/2,20);
        
        generaEnemigoD();
        generaEnemigoI();
    }
    
    /**
     * Comprueba el escore para avanzar de nivel 
     */
    public void nextlevel(int nilai){
        if(jug.score==nilai||jug.score>=nilai){
            mainstart.bgsound.stop();
            Greenfoot.playSound("win.mp3");
            Greenfoot.setWorld(new win());
        }
    }
    
    /**
     * Metodo que genera los objetos que caen
     */
    public void generaItem(){
        if(Greenfoot.getRandomNumber(800)<3){
            addObject(new Manzana(),Greenfoot.getRandomNumber(640) , 0);
        }
        if(Greenfoot.getRandomNumber(1000)<2){
            addObject(new Platano(),Greenfoot.getRandomNumber(640) , 0);
        }
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new Calavera(),Greenfoot.getRandomNumber(640) , 0);
        }
        if(Greenfoot.getRandomNumber(800)<1){
            addObject(new Cascara(),Greenfoot.getRandomNumber(640) , 0);
        }
        
        if(Greenfoot.getRandomNumber(1000)<1){
            addObject(new Cereza(),Greenfoot.getRandomNumber(640) , 0);
        }
    }
    
    /**
     * Metodo que resta vidas
     */
     public void restaVid(){
        if(vidas<=2){
           removeObject(vida3);           
        }
        if(vidas<=1){
           removeObject(vida2);
        }
        if(vidas<=0){
           removeObject(vida1);
           Greenfoot.playSound("gameover.mp3");
           Greenfoot.setWorld(new gameover());
        } 
    }
    
    /**
     *  Metodo que genera enemigos del lado derecho
     */
    public void generaEnemigoD()
    {
        if (eneDniv1.getWorld() == null && Greenfoot.getRandomNumber(100) == 1)
            addObject(eneDniv1, 30, 520);
    }
     
    /**
     * Metodo que genera enemigos del lado Izquierdo
     */
    public void generaEnemigoI()
    {
        if (eneIniv2.getWorld() == null && Greenfoot.getRandomNumber(100) == 1)
            addObject(eneIniv2, 885, 535);
    }
}
