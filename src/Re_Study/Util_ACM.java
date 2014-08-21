/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java * */
package Re_Study;
import acm.graphics.*;


import acm.program.GraphicsProgram;
import java.awt.Color;

public class Util_ACM extends GraphicsProgram{
    @Override
    public void run() {
       G3DRect rec = new G3DRect(100, 200, 100, 100);
//        rec.setRaised(true);
        rec.setFillColor(Color.yellow);
        rec.setFilled(true);
        add(rec);
        GPen pen = new GPen(300, 300);
        for (int i = 0; i <= 360; i+=10) {
            pen.drawPolarLine(10, i);
            
        }
        pen.setFillColor(Color.yellow);
        pen.setVisible(true);
        add(pen);
    }
    
    public static void main(String[] args) {
        new Util_ACM().start();
    }

}
