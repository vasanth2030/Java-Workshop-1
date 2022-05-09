package basicJava;

import java.util.Scanner;

public class LoopsJava {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

//		int i = 1;
//		while (i <= n) {
//			i++;
//			if(i==3)
//				continue;
//			System.out.println("Hello "+i);
//		}
		
		
//		do {
//			System.out.println("Hello "+i);
//			i++;
//		}while(i<=n);
		
		
//		for(int i=1;i<=n;i++)
//		{
//			System.out.println("Hello "+i);
//		}
		
		
//		String result;
//		if(n>18)
//			result="Adult";
//		else
//			result="Child";
		
		System.out.println((n>18) ? "Adult" : "Child");
		
//		System.out.println(result);
		
		
		System.out.println("Outside loop.");
	}
}
