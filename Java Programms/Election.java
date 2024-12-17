 import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the age: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x>=18) {
            System.out.println("eligible");
        }
          else   {
                System.out.println("Not eligible");

            }
        }
    }

