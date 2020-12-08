
/**
 * Simulates Monte Hall Games 
 * Nikhil
 * 11/18/20
 */
import java.util.Random;
public class MonteHall
{
    public static void main(String args[]){
    int switches = 0;
    int keep = 0;
    Random gen = new Random();
    for (int i = 0; i < 1000; i++)
    {
        int car = gen.nextInt(3) + 1;
        int choice = gen.nextInt(3) + 1;
        if (car == choice)
        {
            keep++;
        }
        else
        {
            switches++;
        }
    }
    System.out.println("Keeping wins " + keep + " times.");
    System.out.println("Switching wins " + switches + " times.");
}
}
