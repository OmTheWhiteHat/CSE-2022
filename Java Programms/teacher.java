public class teacher
{
    int id;
    String name;
    teacher(int i, String n)
    {
        id = i;
        name = n;
    }
    void display ()
    {
        System.out.println(id+":"+name);
    }

    public static void main(String[] args)
    {
        teacher T1 = new teacher(1," Abinash Parida ");
        T1.display();
        teacher T2 = new teacher(2," J.J.Puntia ");
        T2.display();
    }
}
