/**
 * * @author Mr. Ahmed Elmasry WWW.FanniaBackbone.wikispaces.com/java *
 */
package Chapter_02;

import acm.program.*;
import acm.graphics.*;

public class Checkerboard extends GraphicsProgram {
    /* Private constants */
    private static final int NROWS = 8; /* Number of rows */
    private static final int NCOLUMNS = 8; /* Number of columns */

    /**
     * Runs the program
     */
    @Override
    public void run() {
        setSize(600,600);
        double sqSize = (double) getHeight() / NROWS;
        for (int i = 0; i < NROWS; i++) {
            for (int j = 0; j < NCOLUMNS; j++) {
                double x = j * sqSize;
                double y = i * sqSize;
                GRect sq = new GRect(x, y, sqSize, sqSize);
                sq.setFilled((i + j) % 2 != 0);
                add(sq);                
            }
        }
    }
    public static void main(String[] args) {
        new Checkerboard().start();
    }

}
/*
* File: Checkerboard.java
* -----------------------
* This program draws a checkerboard. The dimensions of the
* checkerboard is specified by the constants NROWS and
* NCOLUMNS, and the size of the squares is chosen so
* that the checkerboard fills the available vertical space.
*/
