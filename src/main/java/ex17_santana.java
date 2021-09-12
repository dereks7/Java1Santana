import java.util.Scanner;
/*
Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.


Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.
 */

public class ex17_santana
{
    public static void main( String[] args ) {
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        Scanner in1 = new Scanner(System.in);
        String morf = in1.nextLine();
        int n1 = Integer.parseInt(morf);

        double adr = 0.00;
        if(n1 == 1)
        {
            adr = 0.73;
        }
        else if(n1 == 2)
        {
            adr = 0.66;
        }

        System.out.println("How many ounces of alcohol did you have? ");
        Scanner in2 = new Scanner(System.in);
        String oz = in1.nextLine();
        int n2 = Integer.parseInt(oz);

        System.out.println("What is your weight, in pounds? ");
        Scanner in3 = new Scanner(System.in);
        String weight = in1.nextLine();
        int n3 = Integer.parseInt(weight);

        System.out.println("How many hours has it been since your last drink? ");
        Scanner in4 = new Scanner(System.in);
        String hrs = in1.nextLine();
        int n4 = Integer.parseInt(hrs);
        System.out.println("\n");

        // (A × 5.14 / W × r) − .015 × H
        double left = (n2*5.14);
        double right = (n3/adr);
        double end = (0.015*n4);
        double BAC = (left/right)-end;
        //double BAC = (((n2 * 5.14) / (n3*adr)) - (0.015 * n4));

        System.out.println("Your BAC is "+ BAC + ".");

        if(BAC > 0.08)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else if(BAC <= 0.08)
        {
            System.out.println("It is legal for you to drive.");
        }
    }
}
