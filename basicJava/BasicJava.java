package basicJava;

import java.util.Scanner;

public class BasicJava {
	
	public static void main(String[] args) {
		
		String name;
		int age;
		float height;   // 178.5f 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		age= sc.nextInt();
		
		System.out.println("Enter your height: ");
		height = sc.nextFloat();
		
		System.out.println(name);
		
		System.out.println("Age: "+ age +" Height: " +height);
		System.out.println(age + " "+ height);
		
		System.out.println("Hello World");
	
		
	}

}

