import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //This Program is written By Om Prakash
        Scanner cs=new Scanner(System.in);
        String op;
        System.out.print("Choose the operator(+,_,*,/,%): ");
        op=cs.nextLine();
        System.out.println("---------------------------");
        int a,b;
        System.out.print("\n");
        System.out.print("Enter the first number: ");
        a=cs.nextInt();
        System.out.print("Enter the second number: ");
        b=cs.nextInt();
        System.out.print("\n");
        System.out.println("--------------------------");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("--------------------------");
        switch (op) {
            case "+":
                System.out.println(a + "+" + b + "=" + (a + b));
                System.out.println("--------------------------");
                break;
            case "-":
                System.out.println(a + "-" + b + "=" + (a - b));
                System.out.println("--------------------------");
                break;

            case "*":
                System.out.println(a + " x " + b + " = " + (a * b));
                System.out.println("--------------------------");
                break;

            case "/":
                System.out.println(a + " / " + b + " = " + (a / b));
                System.out.println("--------------------------");
                break;
            case "%":
                System.out.println(a+" % "+b+" = "+(a%b));
                System.out.println("--------------------------");
                break;

            default:
                System.out.println("Please enter a valid operator");
                System.out.println("--------------------------");

        }
    }
}


