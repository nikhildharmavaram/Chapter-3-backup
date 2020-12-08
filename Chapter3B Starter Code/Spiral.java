
/**
 * Draws a spiral
 *
 * Nikhil Dharmavaram
 * 12/3/20
 */
import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
public class Spiral
{
    public static void main(String args[])
    {
        StandardPen pen = new StandardPen();
        pen.home();
        for (int i = 1; i <= 100; i++)
        {
            pen.down();
            pen.move(i);
            pen.turn(90);
        }
    }
}
