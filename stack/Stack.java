package stack;

public class Stack {
	int arr[];
	int top;
	int capacity;
	
	Stack(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		top=-1;
	}
	
	public void push(int val)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			arr[top]=val;
		}
	}
	
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			top--;
		}
	}
	
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
			return arr[top];
	}
	
	public void printStack()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}

}
