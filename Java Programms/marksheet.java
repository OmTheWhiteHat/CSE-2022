import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        String inst , name;
        int a, b, c, d, e, tol, ave, grade, res;
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter your institute name: ");
        inst = cs.nextLine();
        System.out.print("Enter your name: ");
        name = cs.nextLine();
        System.out.print("Enter your first mark(Th-01): ");
        a = cs.nextInt();
        System.out.print("Enter your second mark(Th-02): ");
        b = cs.nextInt();
        System.out.print("Enter your third mark(Th-03): ");
        c = cs.nextInt();
        System.out.print("Enter your fourth mark(Th-04): ");
        d = cs.nextInt();
        System.out.print("Enter your fifth mark(Th-05): ");
        e = cs.nextInt();
        tol = a + b + c + d + e;
        ave = (tol/5);
        String ave1;
        String sub;
        if (ave >= 80)
        {
            ave1 = "A";
        }
        else if(ave >= 60)
        {
            ave1 = "B";
        }
        else if (ave >= 50)
        {
            ave1 = "C";
        }
        else if(ave >=35)
        {
            ave1 = "D";
        }
        else{
            ave1 = "BACK";
        }
        for(int i=ave;i<35;i++)
        {

        }
        System.out.println("-----------------------------------------------------");
        System.out.println("|                            " +inst);
        System.out.println("|       Name:" +name);
        System.out.println("|       Theory-1: " +a);
        System.out.println("|       Theory-2: " +b);
        System.out.println("|       Theory-3: " +c);
        System.out.println("|       Theory-4: " +d );
        System.out.println("|       Theory-5: " +e);
        System.out.println("|       tol:       " +tol);
        System.out.println("|       Average: "+ave);
        System.out.println("|       Grade: "+ave1);
//      System.out.println("|       Result:"+sub);
    }
}

