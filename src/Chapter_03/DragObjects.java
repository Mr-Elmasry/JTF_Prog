/**
 * * @author Mr. Ahmed Elmasry WWW.FanniaBackbone.wikispaces.com/java * */
package Chapter_03;
import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
/**
 * This class displays a mouse-draggable rectangle and oval */
public class DragObjects extends GraphicsProgram {
    /* Private instance variables */
    private GObject gobj;	/* The object being dragged */
    private GPoint last;	/* The last mouse position	*/
    /**
     * Initializes the program     */
    @Override
    public void init() {
        G3DRect rect = new G3DRect(100, 100, 150, 100);
        rect.setFilled(true);
        rect.setColor(Color.RED);
        add(rect);
        GOval oval = new GOval(300, 115, 100, 70);
        oval.setFilled(true);
        oval.setColor(Color.GREEN);
        add(oval);
        addMouseListeners();
        addKeyListeners();
    }

    /**
     * Called on mouse press to record the coordinates of the click
     *
     */
    @Override
    public void mousePressed(MouseEvent e) {
        last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
    }

    /**
     * Called on mouse drag to reposition the object     */
    @Override
    public void mouseDragged(MouseEvent e) {
        if (gobj != null) {
            gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
            last = new GPoint(e.getPoint());
        }
    }

    /**
     * Called on mouse click to move this object to the front
     *
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if (gobj != null) {
            gobj.sendToFront();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {        
        if (ke.getKeyChar()=='M') 
            gobj.move(10, 0);          
        if (ke.getKeyChar()=='m') 
                gobj.move(-10, 0);     
    }
    
    
    
    // The Entry Point;
    public static void main(String[] args) {
        new DragObjects().start();      
    }
    
 /*
 *File: DragObjects.java : Java Task Force : with some Modifications
 * ----------------------
 *	This implementation illustrates the technique of using the
 *	addMouseListeners method to register the program itself as
 *	a listeners for events in the underlying GCanvas.
 */
}
