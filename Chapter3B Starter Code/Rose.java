
/**
 * makes a 4 leaf rose
 *
 * Nikhil Dharmavaram
 *12/3/20
 */
import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
public class Rose
{
    public static void main(String args[])
    {
        StandardPen pen = new StandardPen();
        pen.home();
        for (double angle = 0; angle <= 2 * Math.PI; angle += (Math.PI / 5))
        {
            double r = Math.cos(2 * angle);
            double x = r * Math.cos(angle) * 100;
            double y = r * Math.sin(angle) * 100;
            pen.down();
            pen.move(x, y);
            pen.up();
        }
    }
}
