/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */
package Chapter_02;
import Re_Study.FRect;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class FeltBoard extends GraphicsProgram {
    private static final double PHI = 1.618;
    @Override
    public void run() {
        //red Rectangle;
        FRect redRect = new FRect(100, 50, 100, 100 / PHI);
        redRect.setFillColor(Color.red);
        redRect.setFilled(true);
        redRect.flowMouse();
        this.add(redRect);
        // Green Oval ;
        GOval greenOval = new GOval(150, 50 + 50 / PHI, 100, 100 / PHI);
        greenOval.setFilled(true);
        greenOval.setColor(Color.GREEN);
        add(greenOval);                
    }
    public static void main(String[] args) {
        new FeltBoard().start();
    }
}
/*
* File: FeltBoard.java 
*   the Source :JTF :>> Java Task Force with some Modifications  
* --------------------
* This program offers a simple example of the acm.graphics package
* that draws a red rectangle and a green greenOval. The dimensions of
* the rectangle are chosen so that its sides are in proportion to
* the "golden ratio" thought by the Greeks to represent the most
* aesthetically pleasing geometry.
*/