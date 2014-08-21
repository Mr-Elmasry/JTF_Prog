/**
 * * @author Mr. Ahmed Elmasry WWW.FanniaBackbone.wikispaces.com/java * */
package Chapter_03;

import Chapter_02.GStar;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
public class RandomShapes extends GraphicsProgram {
    /**
     * Runs the program
     */
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < NOBJECTS; i++) {
                addOneRandomShape();
                pause(PAUSE_TIME);
            }
            waitForClick();
            removeAll();
        }
    }
    /* Adds a random shape to the canvas */
    private void addOneRandomShape() {
        GObject gobj = createRandomShape();
        gobj.setColor(rgen.nextColor());
        if (gobj instanceof GFillable) {
            ((GFillable) gobj).setFilled(true);
        }
        double x = rgen.nextDouble(0, getWidth() - gobj.getWidth())
                - gobj.getBounds().getX();
        double y = rgen.nextDouble(0, getHeight() - gobj.getHeight())
                - gobj.getBounds().getY();
        add(gobj, x, y);
    }
    /* Generates a random shape whose reference point is the origin */
    private GObject createRandomShape() {
        double width = rgen.nextDouble(MIN_SIZE, MAX_SIZE);
        double height = rgen.nextDouble(MIN_SIZE, MAX_SIZE);
        switch (rgen.nextInt(3)) {
            case 0:
                return new GRect(width, height);
            case 1:
                return new GOval(width, height);
            case 2:
                return new GStar(width);
            default:
                throw new ErrorException("Illegal shape index");
        }
    }
    /* Private constants */
    private static final int NOBJECTS = 10;
    private static final int PAUSE_TIME = 1000;
    private static final double MIN_SIZE = 25;
    private static final double MAX_SIZE = 150;
    /* Private instance variables */
    private final RandomGenerator rgen = RandomGenerator.getInstance();    
    public static void main(String[] args) {
        new RandomShapes().start();
    }
}
/*
 *	File: RandomShapes.java
 * -----------------------
 *	This file creates ten boxes, ovals, and stars at random locations
 *	on the screen, pausing for a suitable interval between each one.
 */
