import java.util.Scanner;
public class forloopreverse
{
    public static void main(String[] args)
    {
        String org;
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter a string: ");
        org=cs.nextLine();
        String rev = "";

        for (int i=0;i<org.length();i++)
        {
            rev = org.charAt(i) + rev;
        }
        System.out.println("Reversed string: " + rev);
    }
}
