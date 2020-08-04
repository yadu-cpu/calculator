import java.util.Scanner;

public class MultiplyDivide {
	public static void main(String args[]) {
		int a, b, result;
		char operation;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if (a < b)
			result = a * b;
		else
			result = a / b;
		System.out.println("Calculated result is" + result);

	}
}
