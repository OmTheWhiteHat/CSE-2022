import java.util.Scanner;

public class Result {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Institute Name:");
        String collegeName= sc.nextLine();
        System.out.println("Enter the student Name:");
        String name= sc.nextLine();
        System.out.println("Enter the marks of 5 subjects:");
        int Th[]=new int[5];
        int total=0;
        int n=0;
        for (int i=0;i<=4;i++)
        {
            System.out.print("Enter the TH-"+(i+1)+"=");
            Th[i]=sc.nextInt();
            total=total+Th[i];
        }
        System.out.println("Display the result:");
        System.out.println("Student Name: "+name);
        System.out.println("Theory       Status");
        System.out.println("---------------------");
        for (int i=0;i<=4;i++)
        {

            System.out.print(" TH-"+(i+1)+"="+Th[i]);
            if (Th[i]>=28){
                System.out.print(" (Pass)");
            }
            else {
                System.out.print(" (Back)");
                n++;
            }
            System.out.println("\n---------------------");


        }
        System.out.println("\nTotal Mark="+total);
        System.out.println("\nTotal no. of Back papers="+n);


    }
}
