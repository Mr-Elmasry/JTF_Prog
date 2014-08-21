/**
 * * @author Mr. Ahmed Elmasry WWW.FanniaBackbone.wikispaces.com/java *
 */
package Chapter_03;
/*
 *	File: DragUsingInnerClasses.java
 * --------------------------------
 *	This implementation illustrates the technique of defining
 *	listeners as anonymous inner classes.
 */

import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

/**
 * This class displays a mouse-draggable rectangle and oval
 */
public class DragUsingInnerClasses extends GraphicsProgram {

    /**
     * Initializes the program
     */
    public void init() {
        GRect rect = new GRect(100, 100, 150, 100);
        rect.setFilled(true);
        rect.setColor(Color.RED);
        add(rect);
        GOval oval = new GOval(300, 115, 100, 70);
        oval.setFilled(true);
        oval.setColor(Color.GREEN);
        add(oval);
        GCanvas canvas = getGCanvas();
        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                last = new GPoint(e.getPoint());
                gobj = getElementAt(last);
            }

            public void mouseClicked(MouseEvent e) {
                if (gobj != null) {
                    gobj.sendToFront();
                }
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (gobj != null) {
                    gobj.move(e.getX() - last.getX(),
                            e.getY() - last.getY());
                    last = new GPoint(e.getPoint());
                }
            }
        });
    }

    /* Private instance variables */
    private GObject gobj;	/* The object being dragged */

    private GPoint last;	/* The last mouse position	*/
    
    public static void main(String[] args) {
        new DragUsingInnerClasses().start();
    }

}
