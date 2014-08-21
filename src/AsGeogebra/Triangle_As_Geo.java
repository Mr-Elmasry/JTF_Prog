/*** @author Mr. Ahmed Elmasry 
 *   Mr_el_masry@yahoo.com  *Date:Aug 16, 2014  */

package AsGeogebra;

import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class Triangle_As_Geo extends GraphicsProgram {

    GPoint a;
    GPoint b;
    GPoint c;
    GPolygon tri;

    @Override
    public void init() {        
        addMouseListeners();
    }

    @Override
    public void run() {
        
    }

    public static void main(String[] args) {
        new Triangle_As_Geo().start();
    }
}
