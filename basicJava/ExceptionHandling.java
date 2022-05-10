package basicJava;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		divide(num1,num2);
		
		System.out.println("End of code.");
		
	}

	public static void divide(int num1, int num2) {
		
		int div= num1/num2;
		System.out.println("Division value: "+div);
		
	}

}
