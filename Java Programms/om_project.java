import java.util.Scanner;

public class om_project
{
    public static void main(String[] args)
    {
        int[] Th=new int[5];
        String name;
        int sum=0;
        int back=0;
        try (Scanner cs = new Scanner(System.in))
        {
            System.out.println("\n----------------------------------");
            System.out.println("BHADRAK ENGG. SCHOOL AND TECHNOLOGY");
            System.out.println("----------------------------------\n");
            System.out.print("Enter your name= ");
            name = cs.nextLine();
            System.out.println("\n--------------------------------");
            for (int i = 0; i <= 4; i++)
            {
                System.out.print("Enter the mark of Th-" + (i + 1) + " = ");
                Th[i] = cs.nextInt();
                System.out.println("--------------------------------");
                sum = sum + Th[i];
            }
        }
        System.out.println("\n\n");
        System.out.println("       --- Information ---");
        System.out.println(" BHADRAK ENGG SCHOOL AND TECHNOLOGY");
        System.out.println(" Name of the Student= "+name);
        System.out.println(" Th           status");
        System.out.println("-----       ----------");
        for(int i=0;i<=4;i++)
        {
            System.out.print("Th-"+(i+1)+" = "+Th[i]);
            if(Th[i]<=28)
            {
                System.out.print("   (BACK)\n");
                back++;
            }
            else
            {
                System.out.print("   (PASS)\n");
            }
        }
        System.out.println("\nTotal ="+sum);
        System.out.println("Average ="+(sum/5)+"%");
    }
}
