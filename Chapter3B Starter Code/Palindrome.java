
/**
 * Checks for string is palindrome
 *
 * Nikhil
 * 11/20/20
 */
import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        String palindrome;
        Scanner in = new Scanner(System.in);
        System.out.print("String: ");
        palindrome = in.nextLine().toLowerCase();
        palindrome = palindrome.replace(" ", "");
        int count = 0;//counter for same characters at i and j
        int bad = 0; //counter for different characters at i and j
        // "2 for 1" for loop, any way to make this better?
        for (int i = 0, j = palindrome.length() - 1; i < palindrome.length() && j > -1; i++, j--)
        {
            if (palindrome.charAt(i) == palindrome.charAt(j))
            {
                count++;
            }
            else
            {
                bad++;
            }
        }
        if (bad == 0)
        {
            System.out.println("Is a palindrome");
        }
        else
        {
            System.out.println("Not a paindrome");
        }
    }
}
