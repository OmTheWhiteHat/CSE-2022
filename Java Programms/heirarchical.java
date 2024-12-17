//-Heirarchical- Inheritance
class engg
{
    public void engineer()
    {
        System.out.println("I am an Engineer");
    }
}
class a extends engg
{
    public void cse() {
        System.out.println("I am a Software engineer");
    }
}
class b extends engg
{
    public void civil()
    {
        System.out.println("I am a constructor");
    }
}
class c extends engg
{
    public void electrical()
    {
        System.out.println("I am an Electrical Engineer");
    }
}
public class heirarchical
{
    static engg en = new engg();
    static a cs = new a();
    static b cl = new b();
    static c el = new c();

    public static void main(String[] args) {
        en.engineer();
        cs.cse();
        cl.civil();
        el.electrical();
    }
}
