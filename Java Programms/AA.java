public class AA {
    public void msg() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        AA x = new AA();
        x.msg();
        class BB {
            public static void main(String[] args) {
                AA obj = new AA();
                obj.msg();
            }
        }
    }
}




