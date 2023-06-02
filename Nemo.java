import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Nemo extends Characters
{
    protected int width=10;
    protected int height=10;
    
    protected int speed = 3;
    protected int turnAngle = 4;
    
    protected GreenfootImage image;
    
    private SeaWorld world;
    
    public Nemo()
    {
        image = getImage();
        
        width = image.getWidth();
        height = image.getHeight();
        image.scale((int)(width * 0.06), (int)(height * 0.06));
    }
     
     
    
    public void act()
    {
        turnAndMove(); 
        if(eat(Insect1.class)==true)
        {
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new Insect1(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        }
        if(eat(Insect2.class)==true)
        {
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new Insect2(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(2);
        }
        if(eat(Insect3.class)==true)
        {
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new Insect3(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(3);
        }
    }
    

    
    
    public void turnAndMove()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-turnAngle);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(turnAngle);
        }  
        
        if(Greenfoot.isKeyDown("space"))
        {
             move(speed);    
        }         
    }
    

    public void move4Ways()
    {
        int x = getX(); int y = getY();
        int halfWidth = width / 2;
        
        if(Greenfoot.isKeyDown("left") && x > halfWidth)
        {
            setRotation(270);
            x -= speed;
        }
        
        if(Greenfoot.isKeyDown("right") && !isAtEdge())
        {
            setRotation(90);
            x += speed;
        }        
        
        if(Greenfoot.isKeyDown("down") && !isAtEdge())
        {
            setRotation(180);
            y += speed;
        } 
        
        if(Greenfoot.isKeyDown("up") && y > speed)
        {
            setRotation(0);
            y -= speed;
        }
        
        setLocation(x, y);        
    }
}
