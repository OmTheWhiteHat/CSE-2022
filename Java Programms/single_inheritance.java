class engineer{
    public void branch(){
        System.out.println("this is the class of engineer");
    }
}
    class student3 extends engineer{
    public void cs(){
        System.out.println(" this is the class of student ");
    }

     }
     class single_inheritance{
         public static void main(String[] args) {
             student3 obj=new student3();
             obj.cs();
             obj.branch();
         }
     }







