/*** @author Mr. Ahmed Elmasry 
 *   Mr_el_masry@yahoo.com  *Date:Aug 19, 2014  */

package AsGeogebra;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;

public class ThreeDotTriangle extends GraphicsProgram {
    
    
    private static int clicks = 0;
    private final GPoint[] dots = new GPoint[3];
    public static final int DOT_SIZE = 5;
    GLabel lbl ;
    
   @Override
    public void init() {
        setSize(600, 300);
        lbl = new GLabel("Click three then Click anywhere", 10, 30);
        add(lbl);
        addMouseListeners();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        drawDot(x, y);
    }

    private void drawDot(int x, int y) {
        
        int red   = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue  = (int) (Math.random() * 255);

        GOval dot = new GOval(x, y, DOT_SIZE, DOT_SIZE);
        dot.setFillColor(new Color(red, green, blue));
        dot.setFilled(true);
        this.add(dot);

        clicks++;
        drawTriangle(x, y, dot, new Color(red, green, blue));
    }
    

    private void drawTriangle(int x, int y, GOval dot,Color color) {
        try {
            dots[clicks - 1] = new GPoint(x + 2.5, y + 2.5);
        } catch (IndexOutOfBoundsException ex) {
           
            remove(dot);
            GPolygon tri = new GPolygon(dots);
            tri.setFillColor(color);
            tri.setFilled(true);
            add(tri);
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }
    
    public static void main(String[] args) {
        new ThreeDotTriangle().start();
    }
}
