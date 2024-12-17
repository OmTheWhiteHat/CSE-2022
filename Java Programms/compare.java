import java.util.Scanner;

  public class compare {
    public static void main(String[] args) {
      int x, y;
      System.out.println("enter two number");
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
      y = sc.nextInt();
      if (x > y) {
        System.out.println("result=1");
      } else if (x < y) {
        System.out.println("result=-1");
      } else {
        System.out.println("result=0");
      }
    }
  }










