public class student
{
    int id;
    String name;
    student (int i,String n) {
        id = i;
        name = n;
    }
    void display () {
        System.out.println(id + " : " + name);
    }

    public static void main(String[] args)
    {
        student S1 = new student(1,"Om Prakash");
        S1.display();

        student S2 = new student(2, "Debabrata");
        S2.display();
    }
}



