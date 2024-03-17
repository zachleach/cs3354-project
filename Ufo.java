import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ufo extends Actor {

    public void act() {
		handle_movement();
		handle_collision();
    }

	public void handle_collision() {
		ArrayList<Asteroid> asteroids = (ArrayList<Asteroid>) this.getIntersectingObjects(Asteroid.class);
		Gem gem = (Gem) this.getOneIntersectingObject(Gem.class);

		if (asteroids.size() > 0) {
			MyWorld.getInstance().endGame();
		}
		else if (gem != null) {
			/* delete gem, increment score, and spawn another */
			MyWorld.getInstance().removeObject(gem);
			MyWorld.getInstance().getScore().increment();
			MyWorld.getInstance().spawnGem();
		}
	}

	public void handle_movement() {
		if (Greenfoot.isKeyDown("left")) {
			turn(-5);
		}
		if (Greenfoot.isKeyDown("right")) {
			turn(5);
		}
		if (Greenfoot.isKeyDown("up")) {
			this.move(5);
		}

	}
}
