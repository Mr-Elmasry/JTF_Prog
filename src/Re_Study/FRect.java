/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java * 
 */
package Re_Study;

import acm.graphics.GRect;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FRect extends GRect {

    public FRect(double d, double d1) {
        super(d, d1);
    }

    public FRect(double d, double d1, double d2, double d3) {
        super(d, d1, d2, d3);
    }

    public void flowMouse() {
        final double w = this.getX(), h = this.getY();
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                setLocation(e.getX() - w / 2, e.getY() - h / 2);
            }
            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

    }
}
