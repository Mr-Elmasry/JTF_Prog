/*** @author Mr. Ahmed Elmasry 
 *   Mr_el_masry@yahoo.com *Aug 11, 2014  */

package Re_Study;
import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.Color;
public class DrawTriangle extends GraphicsProgram{
    
    private final GPoint[] gpoints = new GPoint[3];;
    private GPolygon triangle;

    @Override
    public void run() {
        draw(100,300);         
    }

    private void draw(double height, double base) {

        double ax = getWidth() / 2, ay = getHeight() / 8;
        
        GPoint a = new GPoint(ax, ay);
        GPoint b = new GPoint(ax + base / 2, ay + height);
        GPoint c = new GPoint(ax - base / 2, ay + height);
        
        gpoints[0] = a; gpoints[1] = b; gpoints[2] = c;
        
        triangle = new GPolygon(gpoints);
        triangle.setFillColor(Color.ORANGE);
        triangle.setFilled(true);
        add(triangle);
    }
 
    public static void main(String[] args) {        
        new DrawTriangle().start();
    }
}
