import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portero extends Actor
{
    public Portero()
    {
        GreenfootImage myImage=getImage();
        double myNewHeight=(double)myImage.getHeight()/2*1.3;
        double myNewWidth=(double)myImage.getWidth()/2*1.3;
        myImage.scale((int)myNewWidth, (int)myNewHeight);
    }
    /**
     * Act - do whatever the Portero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean bool=true;
    private Actor Balón;
      private void pause(int i) //Quelle suchen
        { 
        try {
            Thread.sleep(i);
            getWorld().repaint();
        }
        catch(InterruptedException ie) { }
        }
    public void act()
    {
        move(15);
        GreenfootImage myImage=getImage();
       /* if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90));
        }*/
        String key = Greenfoot.getKey();
        do {
             if(getX()<=100||getX()>=getWorld().getWidth()-100){
            turn(180);
            myImage.rotate(-180);
            }
            if(getY()<=100||getY()>=getWorld().getWidth()-100){
            turn(180);
            myImage.rotate(-180);
            }
            if(Greenfoot.isKeyDown("2")||Greenfoot.isKeyDown("1")){
                pause(10);
            }
            if(isTouching(Balón.class)){
                System.out.println("Hola");
            }
     
        }
        while (Greenfoot.isKeyDown("1")||Greenfoot.isKeyDown("2")||Greenfoot.isKeyDown("3")||Greenfoot.isKeyDown("4")||Greenfoot.isKeyDown("5")||Greenfoot.isKeyDown("6")||Greenfoot.isKeyDown("7")||Greenfoot.isKeyDown("8")||Greenfoot.isKeyDown("9"));
    }
}
