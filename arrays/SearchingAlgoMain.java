package arrays;

import java.util.Scanner;

public class SearchingAlgoMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		printArray(arr);
		System.out.println();
		System.out.println("Enter the element to search: ");
		int x=sc.nextInt();
		linearSearch(arr, x);
		binarySearch(arr, x);
		
	}
	
	public static void linearSearch(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("Linear Search: Element found at index "+i);
				return;
			}
		}
		System.out.println("Linear Search: Element not found");
	}
	
	public static void binarySearch(int arr[],int x)
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid= (l+r)/2;
			
			if(arr[mid]==x)
			{
				System.out.println("Binary Search: Element found at index "+mid);
				return;
			}
			else if(arr[mid]<x)
			{
				l=mid+1;
			}
			else
				r=mid-1;
		}
		System.out.println("Binary Search: Element not found");
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
