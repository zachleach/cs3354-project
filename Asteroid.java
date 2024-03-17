import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor {

	private int velocity = 1;

	/** 
	 * Set rotation towards ufo then move (constant speed).
	 *
	 */
	public void act() {
		Ufo u = MyWorld.getUfo();
		this.turnTowards(u.getX(), u.getY());

		move(this.velocity);
	}

	/**
	 * Increase velocity as proximity to ufo increases. 
	 *
	 */
	public void update_velocity() {
		/* TODO */
		this.velocity = 1;
	}





}
