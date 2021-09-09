import java.util.Scanner;

/*
How many euros are you exchanging? 81
What is the exchange rate? 1.3751
81 euros at an exchange rate of 1.3751 is
111.38 U.S. dollars.
*/

public class ex11_santana
{
    public static void main( String[] args )
    {
        System.out.println("How many euros are you exchanging? ");
        Scanner in1 = new Scanner(System.in);
        String eu = in1.nextLine();
        int n1 = Integer.parseInt(eu);
        System.out.println("What is the exchange rate?");
        Scanner in2 = new Scanner(System.in);
        String exch = in2.nextLine();
        double n2 = Double.parseDouble(exch);
        double us = (n1*n2);
        System.out.println(n1 + " euros at an exchange rate of " + n2 + " is \n" + us + " U.S. dollars.");

    }
}
