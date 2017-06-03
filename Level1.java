import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jorge Mendoza Garcia 
 * @author Jaime Eduardo Luna Mireles
 * @version 1.5
 */

public class Level1 extends World
{
    public static int vidas=3; //Atributo para las vidas del jugador
    
    Vida1 vida1 = new Vida1(); //Atributo que crea Vida1 del jugador
    Vida2 vida2 = new Vida2(); //Atributo que crea Vida2 del jugador
    Vida3 vida3 = new Vida3(); //Atributo que crea Vida3 del jugador
    Jugador jug = new Jugador(); //Atributo que crea el jugador
    mainstart mainstart = new mainstart(); //Atributo que crea el menu inicial
    EnemigoD eneDniv1 = new EnemigoD(6); //Atributo que crea el enemigo de la derecha

    Level2 level2 = new Level2(); ////Atributo que crea variable de nivel2
     
    /**
     * Constructor que dibuja el escenario del nivel 1
     */
    public Level1()
    {    
        super(900, 600, 1); 
        
        addObject(new Ground(), 100,680); //Agrega un objeto piso para el escenario
        addObject(new Ground(), 400,680); //Agrega un objeto piso para el escenario
        addObject(new Ground(), 700,680); //Agrega un objeto piso para el escenario

        if(mainstart.bgsound.isPlaying()==false){
            mainstart.bgsound.playLoop(); 
        }
        addObject(vida1, 610 , 20); //Agrega el objeto Vida1 al escenario
        addObject(vida2, 580 , 20); //Agrega el objeto Vida2 al escenario
        addObject(vida3, 550 , 20); //Agrega el objeto Vida3 al escenario
        
        addObject(new Jugador(), getWidth()/2 , 390);//Agrega al jugador en el centro del escenario
    }
    
    /**
     * Metodo que se encarga de ejecutar los metodos de la clase
     */
    public void act(){        
        generaItem();
        restaVid();
        nextlevel(100);
        showText("Level 1",getWidth()/2,20);
        generaEnemigoD();
    }
    
    /**
     * Comprueba el escore para avanzar de nivel 
     */
    public void nextlevel(int nilai){
        if(jug.score==nilai||jug.score>=nilai){
            mainstart.bgsound.stop();
            Greenfoot.playSound("win.mp3");
            level2.vidas=3;
            Greenfoot.setWorld(new levelcomplete1());
        }
    }
    
    /**
     * Metodo que genera los objetos que caen
     */
    public void generaItem(){
        if(Greenfoot.getRandomNumber(800)<3){
            addObject(new Manzana(),Greenfoot.getRandomNumber(640) , 0);
        }
        if(Greenfoot.getRandomNumber(1000)<1){
            addObject(new Platano(),Greenfoot.getRandomNumber(640) , 0);
        }
        if(Greenfoot.getRandomNumber(300)<1){
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
     * Metodo que genera enemigos del lado derecho
     */
    public void generaEnemigoD()
    {
        if (eneDniv1.getWorld() == null && Greenfoot.getRandomNumber(100) == 1)
            addObject(eneDniv1, 30, 520);
    }
    
}
