/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package Chapter_01;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.MediaTools;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class HelloWorld extends GraphicsProgram {

    @Override
    public void init() {
        setSize(800,200);
        setBackground(Color.yellow);        
    }
    
    @Override
    public void run(){
        this.getGCanvas().setCursor(new Cursor
                                          (Cursor.HAND_CURSOR));
        GLabel lbl = new GLabel("Hello, World!", 100, 100);
        lbl.setFont(new Font("Arial", Font.BOLD, 30));
        lbl.setColor(Color.blue);
        this.add(lbl);          
        for (int i = 0; i < 20; i++) {
            waitForClick();
            lbl.setFont(new Font("Arial", Font.BOLD, 30+i*4));            
        } 
        MediaTools.beep();
        
    } 
    
    public static void main(String[] args) {
        new HelloWorld().start();
    }
}
