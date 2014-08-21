/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
package Re_Study;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.event.MouseEvent;
public class F_DrawSquares extends GraphicsProgram{
    GLine l;
    GRect sqr;
    double sqrlenght ;
    
    @Override
    public void init(){
      addMouseListeners();
    }

    @Override
    public void run() {
        
    }
    public static void main(String[] args) {
        new F_DrawSquares().start();
        
    } 

    @Override
    public void mouseDragged(MouseEvent me) {
        l.setEndPoint(me.getX(), me.getY());
        sqrlenght= calcLineLength(l);
        sqr = new GRect(l.getX(),l.getY(),sqrlenght, sqrlenght);
//        sqr.setVisible(true);
        add(sqr);
    }
    @Override
    public void mousePressed(MouseEvent me) {
        l = new GLine(me.getX(), me.getY(), me.getX(), me.getY());
        l.setColor(Color.red);
        add(l);
    }
    
    public double calcLineLength(GLine l){    
    return (Math.sqrt(Math.pow(l.getHeight(), 2)+ Math.pow(l.getWidth(), 2)))/2;
    }
    
}
