import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class ex6_santana
{
    public static void main( String[] args )
    {
        System.out.println( "What is your current age?" );
        Scanner in1 = new Scanner(System.in);
        String age = in1.nextLine();
        int n1 = Integer.parseInt(age);
        System.out.println( "At what age would you like to retire?" );
        Scanner in2 = new Scanner(System.in);
        String retire_age = in2.nextLine();
        int n2 = Integer.parseInt(retire_age);
        System.out.println( "You have " + (n2 - n1) + " years left until you can retire.");
        Date date = new Date();
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String Year = getYearFormat.format(date);
        int years = Integer.parseInt(Year);
        System.out.println("It's "+years+ ", so you can retire in "+ (years+(n2-n1)));
    }
}
