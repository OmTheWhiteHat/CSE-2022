public class Example {
    public static void main(String[] args) {
        try{
            int data =25/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
