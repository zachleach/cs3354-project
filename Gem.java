import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem extends Actor {

	private int random_x, random_y;

	public void act() {

	}

	/**
	 * Construct a gem with random coordinates (internal).
	 */
	public Gem() {
		this.random_x = Greenfoot.getRandomNumber(MyWorld.getInstance().getWidth());
		this.random_y = Greenfoot.getRandomNumber(MyWorld.getInstance().getHeight());

		/* 100 pixels away from border */
		this.random_x = Math.max(100, this.random_x);
		this.random_x = Math.min(MyWorld.getInstance().getWidth() - 100, this.random_x);
		this.random_y = Math.max(100, this.random_y);
		this.random_y = Math.min(MyWorld.getInstance().getHeight() - 100, this.random_y);
	}

	public int getY() {
		return this.random_y;
	}

	public int getX() {
		return this.random_x;
	}

}
