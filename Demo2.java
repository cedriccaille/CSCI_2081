import java.util.Scanner;

public class Demo2 {
  public int add2 (int n1, int n2) {
    return n1 + n2;
  }

  public static void main (String [] args) {
    int first, second;
    double result;
    float f1;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    first = s.nextInt();
    System.out.print("Enter second integer: ");
    second = s.nextInt();

    Demo2 demoobj = new Demo2();
    result = demoobj.add2(first, second);
    f1 = (float)result;
    System.out.println("The result is: " + f1);
  }
}
