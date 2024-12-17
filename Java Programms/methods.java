public class methods {
    int a=10;
    int add(int x, int y)
    {
        display();
        int sum=x+y;
        return sum;
    }

    public static void main(String[] args) {
        methods student=new methods();
        int result=student.add(25,30);
        System.out.println("Result = "+result);
        System.out.println(student.a);
//        display();
    }
    public static void display()
    {
        System.out.println("\nWelcome to Comp. Sc.\n");
    }
}
