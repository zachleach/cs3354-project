import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {

    private static Ufo ufo;
    public static Ufo getUfo() {
        return ufo;
    }

	private static Score score;
	public static Score getScore() {
		return score;
	}

	private static MyWorld instance;
	public static MyWorld getInstance() {
		return instance;
	}

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        super(760, 507, 1); 
        this.setBackground(new GreenfootImage("images/space_background.png"));
		this.instance = this;

        this.ufo = new Ufo();
        this.addObject(ufo, 380, 250);

		this.score = new Score();
        this.addObject(score, 60, 20);

		Gem ig = new Gem();
		this.addObject(ig, ig.getX(), ig.getY());

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,160,88);
    }

	public void spawnGem() {
		Gem g = new Gem();
		addObject(g, g.getX(), g.getY());
	}

	public void endGame() {
		Greenfoot.setWorld(new EndScreen());
	}
}
