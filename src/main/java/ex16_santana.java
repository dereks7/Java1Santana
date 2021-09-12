import java.util.Scanner;

/*
What is your age? 15
You are not old enough to legally drive.

What is your age? 35
You are old enough to legally drive.
 */

public class ex16_santana
{
    public static void main( String[] args ) {
        System.out.println("What is your age?");
        Scanner in1 = new Scanner(System.in);
        String age = in1.nextLine();
        int n1 = Integer.parseInt(age);

        if (n1 > 15)
        {
            System.out.println("You are old enough to legally drive.");
        }
        else
        {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
