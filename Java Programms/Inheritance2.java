//single Inheritance
public class Inheritance2
{
    public void father()
    {
        System.out.println("This is Father method belongs to Inheritance2");
        int a=10,b=20,c=a+b;
        System.out.println(c);
    }
}
class son extends Inheritance2
{
    public void child()
    {
        System.out.println("This is child class inherited from Inheritance2");
    }
    static son sn = new son();
    public static void main(String[] args)
    {
        System.out.println("This method belongs to son class");
        sn.father();
        sn.child();
    }
}




