import java.util.Scanner;

/*
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.
A = P(1 + rt)
 */

public class ex12_santana
{
    public static void main( String[] args )
    {
        System.out.println("Enter the principal: ");
        Scanner in1 = new Scanner(System.in);
        String prin = in1.nextLine();
        int n1 = Integer.parseInt(prin);
        System.out.println("Enter the rate of interest: ");
        Scanner in2 = new Scanner(System.in);
        String roi = in2.nextLine();
        double n2 = Double.parseDouble(roi);
        System.out.println("Enter the number of years: ");
        Scanner in3 = new Scanner(System.in);
        String numyr = in2.nextLine();
        double n3 = Double.parseDouble(numyr);
        double rate = (n2/100);
        double worth = n1*(1+(rate*n3));
        System.out.println("After "+ n3 + " years at " + n2 + "% the investment will be worth $"+ worth +".");

    }
}
