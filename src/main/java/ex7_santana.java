
import java.util.Scanner;

public class ex7_santana
{
    public static void main( String[] args )
    {
        System.out.println("What is the length of the room in feet?");
        Scanner in1 = new Scanner(System.in);
        String len = in1.nextLine();
        int n1 = Integer.parseInt(len);
        System.out.println("What is the width of the room in feet?");
        Scanner in2 = new Scanner(System.in);
        String wid = in2.nextLine();
        int n2 = Integer.parseInt(wid);
        double sqft = (n1*n2);
        double m1 = (Math.pow(n1,2)) * 0.09290304;
        double met1 = Math.sqrt(m1);
        double m2 = (Math.pow(n2,2)) * 0.09290304;
        double met2 = Math.sqrt(m2);
        System.out.println( "You entered dimensions of "+ n1 + " feet by " + n2 +" feet.");
        System.out.println( "The area is\n"+ (n1*n2) + " square feet");
        double meter = (sqft*sqft) * 0.09290304;
        double square_meters =(met1*met2);
        System.out.println(square_meters + " square meters");
    }
}
