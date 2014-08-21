/*** @author Mr. Ahmed Elmasry 
 *   Mr_el_masry@yahoo.com  *Date:Aug 19, 2014  */

package AsGeogebra;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import acm.util.MediaTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
/**
 * File PolygonByClicks.java 
 */
public class PolygonByClicks extends GraphicsProgram {

        private static int clicksCounter;
        private GLabel lblClicks;
        private static final int DOT_SIZE = 4;

        private GPoint[] pointlst;
        private GPolygon polygon;
        private int NSIDES;

    @Override
    public void init() {
        setSize(800, 400);
        setTitle("Polygon By Clicks App.");
        lblClicks = new GLabel("Click Any Where to Make a Point", DOT_SIZE, 30);
        lblClicks.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblClicks);

        addMouseListeners();
        NSIDES = Integer.parseInt(JOptionPane.showInputDialog("insert sides No.",3));
        pointlst = new GPoint[NSIDES];
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        clicksCounter++;
        drawPoint(me.getX(), me.getY());
        if (clicksCounter < NSIDES) {
            lblClicks.setLabel("Clicks  : " + clicksCounter);
        } else {
            drawPolygon();
            lblClicks.setLabel("Done!");
        }
    }

    private void drawPoint(int x, int y) {
        
        GOval point = new GOval(x, y, DOT_SIZE, DOT_SIZE );
        point.setFillColor(randomColor());
        point.setFilled(true);
        add(point);
        GPoint centerPoint = centerOfOval(point);
        try {
            pointlst[clicksCounter - 1] = centerPoint;
        } catch (IndexOutOfBoundsException e) {
            MediaTools.beep();
            remove(point);
        }
    }

    private void drawPolygon() {
        try {
            polygon = new GPolygon(pointlst);
            polygon.setFillColor(randomColor());
            polygon.setFilled(true);
            add(polygon);
        } catch (Exception e) {
        }
    }

    private GPoint centerOfOval(GOval point) {

        double x = point.getX();
        double y = point.getY();
        return new GPoint(x + DOT_SIZE / 2., y + DOT_SIZE / 2.);
    }

    private Color randomColor() {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        return new Color(r, g, b);
    }

    /**
     * The Entry Point of any java Application.
     *
     * @param args: the Command Line Arguments
     */
    public static void main(String[] args) {
        new PolygonByClicks().start();
    }
}
