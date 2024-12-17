public class handle
{
    public static void main(String[] args)
    {
        try{
            System.out.println("inside the try block");
            int data=25/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception handle");
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally block is always use exception");
        }
        System.out.println("Rest of the code");
    }
}
