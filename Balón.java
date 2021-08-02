import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Balón here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balón extends Actor
{
    private GreenfootSound mus2;
    private GreenfootSound mus3;
    public Balón()
    {
        mus2=new GreenfootSound("Gol.mp3");
        mus3=new GreenfootSound("Silbato.mp3");
        GreenfootImage myImage=getImage();
        int myNewHeight=(int)myImage.getHeight();
        int myNewWidth=(int)myImage.getWidth();
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Balón wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int puntosp=0, puntosj=0; 
    public void act()
    {
        Estadio es = new Estadio(); 
        if(Greenfoot.isKeyDown("1")){
         setLocation(130,300);
         Greenfoot.delay(50);
         gol();
        }
         if(Greenfoot.isKeyDown("2")){
         setLocation(310,300);
         Greenfoot.delay(50);
         gol();
        }
         if(Greenfoot.isKeyDown("3")){
         setLocation(470,300); 
         Greenfoot.delay(50);
         gol();
        }
        if(Greenfoot.isKeyDown("4")) {
          setLocation(130,250); 
          Greenfoot.delay(50);
          gol();
        }
         if(Greenfoot.isKeyDown("5")){
         setLocation(310,250);  
         Greenfoot.delay(50);
         gol();
        }
         if(Greenfoot.isKeyDown("6")){
         setLocation(470,250); 
         Greenfoot.delay(50);
         gol();
        }
         if(Greenfoot.isKeyDown("7")){
         setLocation(130,200); 
         Greenfoot.delay(50);
         gol();
        }
         if(Greenfoot.isKeyDown("8")){
         setLocation(310,200);
         Greenfoot.delay(50);
         gol();
        }
         if(Greenfoot.isKeyDown("9")){
         setLocation(470,200); 
         Greenfoot.delay(50);
         gol();
         
        }  
    }


    public void gol(){
        Estadio es = new Estadio(); 
         if(isTouching(Portero.class)){
            puntosp=puntosp+1;
            es.setscore1(puntosp);
        }else{
            puntosj=puntosj+1;
            es.setscore(puntosj);
            mus2.play();
            Greenfoot.delay(10);
        }
        setLocation(319,381);
        
    }
    
}
