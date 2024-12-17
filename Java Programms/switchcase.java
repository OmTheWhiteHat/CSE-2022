import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner engg = new Scanner(System.in);
        int ch;
        System.out.println("----------------------------------");
        System.out.println("1. Civil Engineer");
        System.out.println("2. Computer science Engineer");
        System.out.println("3. Electrical Engineer");
        System.out.println("4. Mechanical Engineer");
        System.out.println("5. Electronics and Telecommunication Engineer");
        System.out.println("----------------------------------");
        System.out.println("Choose your branch");
        ch=engg.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("I'm a civil Engg.");
                break;
            case 2:
                System.out.println("I'm a Computer Engg.");
                break;
            case 3:
                System.out.println("I'm a electrical Engg.");
                break;
            case 4:
                System.out.println("I'm a Mechanical Engg.");
                break;
            case 5:
                System.out.println("I'm a Electronics and Telecommunication Engg.");
                break;
            default:
                System.out.println("Enter valid choose");
        }
    }
}
