//-Multi-level- Inheritance
class engg1
{
    public void engg1()
    {
        System.out.println("I am an Engineer");
    }
}
class doctor extends engg1
{
    public void doct()
    {
        System.out.println("I am a doctor");
    }
}
public class scientist extends doctor
{
    static scientist sc = new scientist();
    public void sci1()
    {
        System.out.println("I am a Scientist");
    }
    public static void main(String[] args)
    {
        sc.engg1();
        sc.doct();
        sc.sci1();
    }
}
