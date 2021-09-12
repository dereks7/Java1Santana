import java.util.Scanner;

/*
What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.

DecimalFormat df = new DecimalFormat("###.###");
System.out.println(df.format(PI));

A = P(1 + r/n)^(n*t)
 */

public class ex13_santana
{
    public static void main( String[] args )
    {
        System.out.println("What is the principal amount? ");
        Scanner in1 = new Scanner(System.in);
        String prin = in1.nextLine();
        int n1 = Integer.parseInt(prin);
        System.out.println("What is the rate?");
        Scanner in2 = new Scanner(System.in);
        String roi = in2.nextLine();
        double n2 = Double.parseDouble(roi);
        System.out.println("What is the number of years? ");
        Scanner in3 = new Scanner(System.in);
        String numyr = in2.nextLine();
        double n3 = Double.parseDouble(numyr);
        System.out.println("What is the number of times the interest is compounded per year? ");
        Scanner in4 = new Scanner(System.in);
        String times = in2.nextLine();
        double n4 = Double.parseDouble(times);
        double rate = (n2/100);
        double worth = n1*(1+(rate*n3));
        double ins = (1+rate/n4);
        double exp = (n4*n3);
        double tot = (n1*(Math.pow(ins,exp)));
        double round = Math.round(tot*100.0)/100.0;
        System.out.println("$"+ n1 +  " invested at "+n2+ "% for " + n3 + "years compounded " + n4 + "times per year is $"+round+".");

    }
}
