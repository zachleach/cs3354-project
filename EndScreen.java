import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World {
    public EndScreen() {
        super(760, 507, 1); 
		GreenfootImage bg = this.getBackground();
		bg.setColor(Color.BLACK); bg.fill();

		GreenfootImage text = new GreenfootImage("GAME OVER", 80, Color.WHITE, null);
		bg.drawImage(text, (bg.getWidth() - text.getWidth()) / 2, (bg.getHeight() - text.getHeight()) / 2);

		Greenfoot.stop();
	}
}
