import java.util.Scanner;

public class ex3_santana
{
    public static void main( String[] args )
    {
        System.out.println( "What is the quote?" );
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println( "Who said it?" );
        Scanner inp = new Scanner(System.in);
        String input2 = in.nextLine();
        System.out.println(input2+" says, "+"\""+input+ "\"");
    }
}
