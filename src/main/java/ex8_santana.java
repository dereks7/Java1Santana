import java.util.Scanner;

public class ex8_santana
{
    public static void main( String[] args )
    {
        System.out.println("How many people?");
        Scanner in1 = new Scanner(System.in);
        String ppl = in1.nextLine();
        int n1 = Integer.parseInt(ppl);
        System.out.println("How many pizzas do you have?");
        Scanner in2 = new Scanner(System.in);
        String yourpiz = in2.nextLine();
        int n2 = Integer.parseInt(yourpiz);
        System.out.println("How many slices per pizza?");
        Scanner in3 = new Scanner(System.in);
        String perpiz = in3.nextLine();
        int n3 = Integer.parseInt(perpiz);
        int slices = n2*n3;
        int each = (slices/n1);
        int leftover = (each * n1) - slices;
        System.out.println( n1+" people with "+ n2 + " pizzas " + "("+ slices + " slices)");
        System.out.println( "Each person gets "+ each + " pieces of pizza.");
        System.out.println( "There are " + leftover +" leftover pieces.");
    }
}
