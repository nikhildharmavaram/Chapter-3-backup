
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
        int start = 0;
        int next = 1;
        char answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter t for number of terms, or n for max number");
        answer = in.next().charAt(0);
        if (answer == 't')
        {
            int terms;
            System.out.print("Enter the number of terms: ");
            terms = in.nextInt();
            for (int i = 0; i < terms; i++)
            {
                System.out.print(start + " ");
                int sum = start + next;
                start = next;
                next = sum;
            }
        }
        else if (answer == 'n')
        {
            int max;
            System.out.print("Enter the maximum number");
            max = in.nextInt();
            for (int j = 0; j < 100; j++)
            {
                start = 0;
                next = 1;
                System.out.print(start + " ");
                int sums = start + next;
                start = next;
                next = sums;
                if (next > max)
                {
                    break;
                }
            }
        }
    }
}
