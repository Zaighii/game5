import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 */
public class SeaWorld extends World
{
    public static final int MAXN_INSECT1 = 10;
    public static final int MAXN_INSECT2 = 20;
    public static final int MAXN_INSECT3 = 30;
    
    private Nemo nemo;
    private Bee bee;
    private Insect1[] Insect1;
    private Insect2[] Insect2;
    private Insect3[] Insect3; 
    private int beeSize = 30;
    private int remainingInsect1= MAXN_INSECT1;
    private int remainingInsect2= MAXN_INSECT2;
    private int remainingInsect3= MAXN_INSECT3;
    private Random generator = new Random();
    private Counter score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SeaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        nemo = new Nemo();
        addObject(nemo, 200, 200);
        
        bee = new Bee();
        addBee();
        addBee();
        addBee();
        addBee();
        addBee();
    
      
        
        Insect1 = new Insect1[10];
        addInsect1();
        addInsect1();
        addInsect1();
        
        Insect2 = new Insect2[20];
        addInsect2();
        addInsect2();
        addInsect2();
        
        Insect3 = new Insect3[30];
        addInsect3();
        addInsect3();
       
      
        
        setupScore();
    }
    
    public void addInsect1()
    {
        createInsect1();
    }
    
    public void addInsect2()
    {
        createInsect2();
    }
    
    public void addInsect3()
    {
        createInsect3();
    }
    
    public void addBee()
    {
        createBee();
    }
    
    private void createBee()
    {
    Bee bee = new Bee();
    int x = generator.nextInt(getWidth());
    int y = generator.nextInt(getHeight());
        
         addObject(bee, x, y);
    }
    
    private void createInsect1()
    {
        Insect1 insect1 = new Insect1();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
         addObject(insect1, x, y);
        
    }
    
    private void createInsect2()
    {
        Insect2 Insect2 = new Insect2();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
         addObject(Insect2, x, y);
        
    }
    
    private void createInsect3()
    {
        Insect3 insect3 = new Insect3();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
         addObject(insect3, x, y);
        
    }
    
    public void score()
    {
    }
    
    public void Counter()
    {
    }
    
    private void setupScore()
    {
        score = new Counter("Score: ");
        addObject (score, 60, 30);
    }
    
    
    public void loseGame()
    {
        showText("Game Over: You have Lost!", 400, 300);
    }
    
   public void winGame()
    {
        showText("Game Over: You have Won!", 400, 300);
    }    
}
