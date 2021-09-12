import java.util.Scanner;

/*
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
 */

public class ex14_santana
{
    public static void main( String[] args ) {
        System.out.println("What is the order amount? ");
        Scanner in1 = new Scanner(System.in);
        String ord = in1.nextLine();
        int n1 = Integer.parseInt(ord);
        System.out.println("What is the state? ");
        Scanner in2 = new Scanner(System.in);
        String state = in2.nextLine();
        double sub = Double.parseDouble(ord);
        System.out.println("The subtotal is $" + sub + ".");
        double tax=0;
        if (!state.equals("MN")) {
            tax = sub * 0.055;
        }
        if(state.equals("MN"))
            tax = 0.0;
        System.out.println("The tax is $" + tax + ".");
        double tot = tax + sub;
        double round = Math.round(tot * 100.0) / 100.0;
        System.out.println("The total is $" + round + ".");
    }
}
