/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
package Chapter_03;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class TimesSquare extends GraphicsProgram {
    /* The number of pixels to shift the label on each cycle */

    private static final int DELTA_X = 2;
    /* The number of milliseconds to pause on each cycle */
    private static final int PAUSE_TIME = 20;
    /* The string to use as the value of the label */
    private static final String HEADLINE
            = "When in the course of human events it becomes necessary "
            + "for one people to dissolve the political bands which "
            + "connected them with another . . .";

    /**
     * Runs the program
     */
    @Override
    public void run() {
        GLabel label = new GLabel(HEADLINE);
        label.setFont("Serif-72");
        add(label, getWidth(), (getHeight() + label.getAscent()) / 2);
        while (label.getX() + label.getWidth() > 0) {
            label.move(-DELTA_X, 0);
            pause(PAUSE_TIME);
        }
    }
    
    public static void main(String[] args) {
        new TimesSquare().start();
    }
}
