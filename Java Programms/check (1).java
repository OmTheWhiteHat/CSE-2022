 import java.util.*;
public class check {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.print("Input a number: ");
        int a=cs.nextInt();
        if(a%2 == 0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
