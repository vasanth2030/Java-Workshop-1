package arrays;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
//		int arr[]= {10,20,30,40,50};
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		System.out.println(arr[2]);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element: ");
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("The array elements are: ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
