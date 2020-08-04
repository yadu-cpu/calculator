import java.util.Scanner;

public class AddSubtract {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b)
			result = a + b;
		else
			result = a - b;
		System.out.println("Result of arithmatioc operation is" + result);
	}

}
