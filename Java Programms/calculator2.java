import java.util.Scanner;
public class calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,result;
        String ch;
        System.out.print("Choose the operator(+,_,*,/,%): ");
        ch=sc.next();
        System.out.println("Enter First number");
        a= sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        switch(ch)
        {
            case "+":
                System.out.println("sum is "+a+" + "+b+"="+(a+b));
                break;
            case "-":
                System.out.println("Fraction is "+a+" - "+b+"="+(a-b));
                break;
            case"*":
                System.out.println("Multiplication is "+a+" * "+b+"="+(a*b));
                break;
            case"/":
                System.out.println("Division is "+a+" / "+b+"="+(a/b));
                break;
            case"%":
                System.out.println("Modulus is "+a+" % "+b+"="+(a%b));
                break;
            default:
                System.out.println("Enter correct operation");
        }
        System.out.println("\n");
    }
}
