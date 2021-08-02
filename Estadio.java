import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Estadio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estadio extends World
{
    private GreenfootSound mus1;
    private GreenfootSound mus3;
    public static int score=0;
    public static int score1=0;
    public Estadio()
    {    
        super(600, 400, 1); 
        prepare();
        mus1=new GreenfootSound("Estadio.mp3");
    }
    
    public void setscore(int score){
        this.score=score;
    }
    public void setscore1(int score1){
        this.score1=score1;
    }
    
    public void act(){
        mus1.playLoop();
        showText("Puntos portero: " + score1, 100,25);
        showText("Puntos jugador: " + score, 500,25);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare()
    {
        Balón balón = new Balón();
        addObject(balón,296,380);
        balón.setLocation(296,380);
        balón.setLocation(319,381);
        Portero portero = new Portero();
        addObject(portero,320,235);
        portero.setLocation(318,247);
    }
}
