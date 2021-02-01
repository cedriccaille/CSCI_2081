import java.util.Scanner;

// indefinite iteration: while (condition), do {statements;} while (condition)
// definite iteration: for (initialzation; condition; increment/decrement)
public class Demo4Iteration
{
	public static int add2(int a, int b) {
		return a + b;
	}

	public static void main (String[] args) {

		int first, second;
		double result;
		int count = 5;

		for (int i = 0; i < 5; i++) {

			Scanner s = new Scanner(System.in);
			System.out.print("Enter first integer: ");
			first = s.nextInt();
			System.out.print("Enter second integer: ");
			second = s.nextInt();

			result = add2(first,second);

			System.out.println("The result is: " + result);
		}
	}
}
