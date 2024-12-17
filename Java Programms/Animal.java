interface AnimalEat
{
    void eat();
}
interface AnimalTravel
{
    void travel();
}
class Animal1 implements AnimalEat,AnimalTravel
{
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel()
    {
        System.out.println("Animal is travelling");
    }
}
public class Animal
{
    public static void main(String[] args)
    {
        Animal1 a = new Animal1();
        a.eat();
        a.travel();
    }
}
