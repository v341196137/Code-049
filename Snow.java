import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 * [Snow.java]
 * A class with an {@code Event} that can slow down production and building/upgrades of {@code Buildings}
 * @author Vivian Dai
 * @version 1.0 on December 24, 2020
 */

class Snow extends PhysicalEvent{
    /**
     * Constructor for the {@code Snow} class
     * @param duration how long the {@code Snow} will last for
     * @param timeLeft how much longer the {@code Snow} will last for
     * @param effectAmount the factor which things will be slowed down by
     * @param aoe the area of effect
     * @param sprite the {@code Image} to draw for the {@code Snow}
     */ 
    public Snow(int duration, int timeLeft, int effectAmount, Rectangle aoe, Image sprite){
        super(duration, timeLeft, effectAmount, aoe, sprite);
    }

    /**
     * Slows down production, building, and upgrading in the area of effect by a factor of effectAmount
     * @param game the {@code Game} the {@code Snow} is affecting
     */
    @Override
    public void affect(Game game){
        //TODO: implement snow effect after game class is made
    }

    /**
     * Draws the {@code Image} for {@code Snow} on the {@code Graphics} g
     * @param g the {@code Graphics} to draw on
     */
    public void draw(Graphics g){
        g.drawImage(this.getSprite(), this.getAoe().x, this.getAoe().y, this.getAoe().width, this.getAoe().height, null);
    }
}