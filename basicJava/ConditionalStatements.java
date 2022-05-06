package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	
	public static void main(String[] args) {
		
		/*
		 * int a=10; int b=4; System.out.println(a+b); System.out.println(a-b);
		 * System.out.println(a*b); System.out.println((float)a/b);
		 * System.out.println(a%b);
		 * 
		 * System.out.println();
		 * 
		 * System.out.println(a++); System.out.println(a); System.out.println(--b);
		 * System.out.println(b);
		 */
		
		
		/*
		 * System.out.println("Enter your age: "); int age=sc.nextInt();
		 * 
		 * if(age>60) { System.out.println("Senior Citizen."); }
		 * 
		 * if(age>=18) { System.out.println("You are eligible."); } else {
		 * System.out.println("You are not eligible."); }
		 * 
		 * System.out.println("End of the program.");
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a correct number");
		
		}
		
		System.out.println("End of the program.");
		
	}

}
