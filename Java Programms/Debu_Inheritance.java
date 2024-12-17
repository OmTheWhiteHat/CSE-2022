class animal
{
    void animal()
    {
        System.out.println("This is animal class ");
    }
}
class lion extends animal
{
    void eat()
    {
        System.out.println("Lion is eating");
    }
}
public class Debu_Inheritance extends lion
{
    static Debu_Inheritance dI = new Debu_Inheritance();
    void tg()
    {
        System.out.println("Indian national animal is tiger");
    }
    public static void main(String[] args) {
        dI.animal();
        dI.eat();
        dI.tg();
    }
}
