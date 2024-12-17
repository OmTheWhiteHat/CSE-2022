import java.util.*;
class imp_package
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String userName;
        String fr;
        System.out.println("Enter Your Name:");
        userName=myObj.nextLine();
        System.out.println("Enter your friend name: ");
        fr=myObj.nextLine();
        System.out.println("Your Name Is :"+userName);
        System.out.println("Your Friend name is "+fr);
    }
}