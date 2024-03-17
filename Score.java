import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor {
	private int score;
	private int font_size;

	private boolean t_key;

	public void act() {
		if (Greenfoot.isKeyDown("t") && !t_key) {
			this.increment();

			this.t_key = true;
		}
		else if (!Greenfoot.isKeyDown("t") && this.t_key) {
			this.t_key = false;
		}
	}

	public Score() {
		this.font_size = 24;

		this.update_image();
	}

	public void update_image() {
        setImage(new GreenfootImage("Score: " + this.score, this.font_size, Color.WHITE, null));
	}

	public void increment() {
		score++;
		update_image();
	}
}
