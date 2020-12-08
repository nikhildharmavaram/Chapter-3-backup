
/**
 * Write a description of class FileIO here.
 *
 * Nikhil Dharmavaram
 * 12/2/20
 */
import java.util.Scanner;
import java.io.*;
public class FileIO
{
    public static void main(String args[]) throws IOException
    {
        Scanner scanFile = new Scanner(new File("speeches\\taft.txt"));
        String word = "I";
        int count = 0;
        String current;
        while (scanFile.hasNext())
        {
            current = scanFile.next();
            if (current.equalsIgnoreCase(word))
            {
                count++;
            }
        }
        System.out.println("The number of times I appeared in the speech is " + count);
    }
}
