import java.util.Scanner;

public class ODDEVEN {
    public static void main(String[] args) {
       int num;
       Scanner cs=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=cs.nextInt();
        if(num % 2 == 0)
        {
            System.out.println(num+" is Even number.");
        }
        else
        {
            System.out.println(num+" is Odd number.");
        }

    }
}

