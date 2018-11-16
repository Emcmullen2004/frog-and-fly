import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    //create a Scoreboard variable that we will store a Scoreboard in later
    private Scoreboard score;
    
    
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       
       prepare();
       
       addFood();
       
       score = new Scoreboard();
       
       addObject( score, 70, 10 );
        
    }
    
    int x = Greenfoot.getRandomNumber( getWidth() );
    int y = Greenfoot.getRandomNumber( getHeight() );
            
    /**
     * addFood stores the food objects to place in the world
     * 
     * @param there are no parameters
     * @
     */
     
    //Adds n Food objects to the world
     
    public void addFood()
    {
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
    }
    
    public void prepare()
    {
       addObject(new Fly(), x, y); //adds 1 fly to a random position
       
       addObject(new Frog(), getWidth()/2, getHeight()/2); //adds 1 frog to the middle of the screen
    }
    
    public void update()
    {
        score.addToScore();
    }
    
    public void resetFood()
    {
        if( getObjects(Food.class).isEmpty() == true)
        {
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            addObject(new Food(), Greenfoot.getRandomNumber( getWidth()), Greenfoot.getRandomNumber( getHeight() ));
            
        }
    }
}
