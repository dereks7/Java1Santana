import java.util.Scanner;

public class ex9_santana
{
    public static void main( String[] args )
    {
        System.out.println("width ?");
        Scanner in1 = new Scanner(System.in);
        String ppl = in1.nextLine();
        int n1 = Integer.parseInt(ppl);
        System.out.println("length?");
        Scanner in2 = new Scanner(System.in);
        String yourpiz = in2.nextLine();
        int n2 = Integer.parseInt(yourpiz);

        int sqft = (n1*n2);
        int gal = sqft/350;
        if(sqft < 350)
        {
            gal++;
        }
        else if ( gal*350 < sqft)
        {
            gal++;
        }

        System.out.println( "You will need to purchase " + gal + " gallons of paint to cover "+ sqft + " square feet.");
    }
}
