package basicJava;

import java.util.Scanner;

public class MethodsJava {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		oddOrEven(n);
		System.out.println("Factorial "+factorial(n));
	}
	
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;     //fact=fact*i
		}
		
		return fact;
	}
	
	public static void oddOrEven(int n)
	{
		if(n%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
}
