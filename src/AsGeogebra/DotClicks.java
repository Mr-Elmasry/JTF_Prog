/*** @author Mr. Ahmed Elmasry 
 *   Mr_el_masry@yahoo.com  *Date:Aug 19, 2014  */

package AsGeogebra;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
/**
 * File DotClicks.java 
 * @author Mr.Ahmed
 */
public class DotClicks extends GraphicsProgram {
    
  private static int clicks; 
  private GLabel lblClicks;
  private static final int DOTRADIUS = 15;
  public static final int APPLICATION_WIDTH = 400; 
  public static final int APPLICATION_HIEGHT=400;

    @Override
    public void init() {
//        setSize(800, 400);
        setTitle("Dot Clicks App.");
        lblClicks = new GLabel("Click Any Where to Make a Point", 15 , 30 );
        lblClicks.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblClicks);        
        addMouseListeners();
    }


    @Override
    public void mouseClicked(MouseEvent me) {
        clicks++;
        drawPoint(me.getX(), me.getY(), DOTRADIUS);
        lblClicks.setLabel("Clicks  : "+clicks);
    }   
              
    private void drawPoint(int x, int y,int radius){
        int dimtr = radius* 2 ;
        GOval point = new GOval(x, y, dimtr, dimtr);
        point.setFillColor(randomColor());
        point.setFilled(true);
        add(point);   
    }
    
    private Color randomColor() {
        
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        return new Color(r, g, b);
    }
    
    public static void main(String[] args) {
      new DotClicks().start();
    }
}
