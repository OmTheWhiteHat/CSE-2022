import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int age;
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = s.nextLine();
        System.out.println("Enter your age:");
        age = s.nextInt();
        if (age == 18) {
            System.out.println(name +  "is Eligible for cast");
        } else {
            System.out.println(name + "is not Eligible");
        }
    }
}




