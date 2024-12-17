import java.util.Scanner;

public class Reversal
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String ab;
            System.out.println("Enter a string :");
            ab=sc.nextLine();
            StringBuilder sb=new StringBuilder(ab);
            sb.reverse();

            System.out.println(sb);
        }
    }

