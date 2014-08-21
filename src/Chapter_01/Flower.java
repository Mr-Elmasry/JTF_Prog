/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package Chapter_01;
import acm.graphics.GOval;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class Flower extends GraphicsProgram{   
    @Override
    public void init() {
        setSize(600, 600);
        setBackground(Color.GREEN);
    }   
    
    @Override
    public  void run(){
        final int d = 100;   // Diameter
        final int r = d / 2; // Radius
        final int guidX = getWidth()  / 2 - r;
        final int guidY = getHeight() / 3 - r;

        GOval[] leafs = new GOval[5];
        for (int i = 0; i < leafs.length; i++) {
            leafs[i] = new GOval(d, d);
            leafs[i].setFillColor(Color.yellow);
            leafs[i].setFilled(true);
            add(leafs[i]);
        }
        // Set Locations
        { 
        leafs[0].setLocation(guidX, guidY);
        leafs[1].setLocation(guidX, guidY - d);
        leafs[2].setLocation(guidX, guidY + d);
        leafs[3].setLocation(guidX + d, guidY);
        leafs[4].setLocation(guidX - d, guidY);
        }

        leafs[0].setFillColor(Color.red);
        //show Guid Point on the Drawing
        {
            GOval guidPoint = new GOval(5, 5);
            guidPoint.setLocation(guidX, guidY);
            guidPoint.setFillColor(Color.blue);
            guidPoint.setFilled(true);
            add(guidPoint);
        }
        GLine line = new GLine
                         (guidX + r, guidY + 2 * d, guidX + r, guidY + 4 * d);
        line.setColor(Color.black);
        add(line);
      }
    
    public static void main(String[] args) {
            new Flower().start();
    }
}
