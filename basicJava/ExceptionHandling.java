package basicJava;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		divide(num1, num2);

		System.out.println("End of code.");

	}

	public static void divide(int num1, int num2) {

		try {
			int div = num1 / num2;
			System.out.println("Division value: " + div);
//			throw new RuntimeException("Manually thrown Exception");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter a non-zero divisor");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Caught exception throwed by the 'throw' keyword");
		}finally {
			System.out.println("Inside finally");
		}
	}
	
	public static void div(int a,int b) throws ArithmeticException
	{
		int div=a/b;
		System.out.println(div);
	}

}
