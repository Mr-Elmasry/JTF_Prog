/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java * 
 */
package Chapter_02;

import acm.graphics.*;
/**
* This class defines a GObject subclass that represents a ball
* whose reference point is the center rather than the upper
* left corner.
*/
public class GBall extends GCompound {

    /**
     * Creates a new ball with radius r centered at the origin
     *
     * @param r
     */
    public GBall(double r) {
        GOval ball = new GOval(2 * r, 2 * r);
        ball.setFilled(true);
        add(ball, -r, -r);
        markAsComplete();
    }

    /**
     * Creates a new ball with radius r centered at (x, y)
     *
     * @param r
     * @param x
     * @param y
     */
    public GBall(double r, double x, double y) {
        this(r);
        setLocation(x, y);
    }
}
/*
* File: GBall.java
* ----------------
* This file defines a GObject class that represents a ball.
*/