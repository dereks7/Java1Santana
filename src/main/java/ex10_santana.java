import java.util.Scanner;
/*
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
 */
public class ex10_santana
{
    public static void main( String[] args )
    {
        System.out.println("Enter the price of item 1: ");
        Scanner in1 = new Scanner(System.in);
        String i1 = in1.nextLine();
        int n1 = Integer.parseInt(i1);

        System.out.println("Enter the quantity of item 1: ");
        Scanner inq1 = new Scanner(System.in);
        String q1 = in1.nextLine();
        int qu1 = Integer.parseInt(q1);

        System.out.println("Enter the price of item 2: ");
        Scanner in2 = new Scanner(System.in);
        String i2 = in2.nextLine();
        int n2 = Integer.parseInt(i2);

        System.out.println("Enter the quantity of item 2: ");
        Scanner inq2 = new Scanner(System.in);
        String q2 = in1.nextLine();
        int qu2 = Integer.parseInt(q2);

        System.out.println("Enter the price of item 3: ");
        Scanner in3 = new Scanner(System.in);
        String i3 = in1.nextLine();
        int n3 = Integer.parseInt(i3);

        System.out.println("Enter the quantity of item 3: ");
        Scanner inq3 = new Scanner(System.in);
        String q3 = in1.nextLine();
        int qu3 = Integer.parseInt(q3);

        double total = ((n1*qu1)+(n2*qu2)+(n3*qu3));
        double tax = 0.055;
        double tottax = total*tax;
        double subtotal = tottax + total;

        System.out.println( "Subtotal: $"+ total + "\nTax: $"+ tottax + "\nTotal: $"+ subtotal);
    }
}
