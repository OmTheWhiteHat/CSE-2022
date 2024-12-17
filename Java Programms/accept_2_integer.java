import java.util.Scanner;

public class accept_2_integer {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.print("Input the first num: ");
        int a=cs.nextInt();
        System.out.print("Input the second num: ");
        int b=cs.nextInt();
        System.out.println("Result: "+result(a,b));
    }
    public static int result(int x,int y)
    {
        if(x == y)
            return 0;

        if(x % 6 == y % 6)
            return(x<y)?x:y;

        return(x>y)?x:y;
    }
}
