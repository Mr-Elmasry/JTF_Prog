/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package Chapter_01;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloGraphics extends GraphicsProgram {  
    GRect redRect;
    GRect blackRect;
    @Override
    public void run() {        
        GPoint fPoint = new GPoint(20, 20);
        GPoint sPoint = new GPoint(20 ,200);
        // Red Rectangle
        redRect = new GRect(100, 100);
        redRect.setLocation(fPoint);
        redRect.setFillColor(Color.red);
        redRect.setFilled(true);
//        redRect.setCursor(Cursor.HAND_CURSOR);
        
      
        redRect.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
            
            
             redRect.setLocation
                (e.getX()-redRect.getWidth()/2,e.getY()-redRect.getHeight()/2);
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                
             
            }
        });
        //Black Rectangle
        blackRect = new GRect(100, 100);
        blackRect.setLocation(sPoint);
        blackRect.setFillColor(Color.black);
        blackRect.setFilled(true);
        add(redRect);
        add(blackRect);
    }
   
     public static void main(String[] args) {
        new HelloGraphics().start();
    } 
}
