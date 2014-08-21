/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java * 
 */
package Re_Study;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.Dimension;
/**
 * 
 * @author Mr.Ahmed Elmasry
 */
public class CheckerBoard extends GraphicsProgram {
    //Multi-Dimensional Array
    double  sqLength ;
        
    @Override
    public void run() {
        
        setSize(600,600);
        sqLength = getHeight() / 8.;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                double x = i * sqLength, y = j * sqLength;
                GRect sq = new GRect(x, y, sqLength, sqLength);
                sq.setFilled((i + j) % 2 != 0);
                add(sq);
            }
        }
//        System.out.println(this.getGCanvas().getWidth());
//        System.out.println(this.getGCanvas().getHeight());
    }
    public static void main(String[] args) {
        new CheckerBoard().start();
    }
}
