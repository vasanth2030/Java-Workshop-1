package linkedlist;

public class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public static void insertNodeAtEnd( Node head, int data)
	{
		Node newNode=new Node(data);
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		
		curr.next=newNode;
		
	}
	
	public static Node insertAtPos(Node head, int data, int pos) {
		Node newNode = new Node(data);
		if(pos==1)
		{
			newNode.next=head;
			return newNode;
		}

		Node curr=head;
		for(int i=1;i<pos-1;i++)
		{
			curr=curr.next;
		}
		newNode.next=curr.next;
		curr.next=newNode;
		return head;
	}
	
	public static Node deletePos(Node head, int pos)
	{
		if(pos==1)
		{
			return head.next;
		}
		Node curr=head;
		for(int i=1;i<pos-1;i++)
		{
			curr=curr.next;
		}
		
		curr.next=curr.next.next;
		return head;
	}
	
	public static Node deleteValue(Node head,int val)
	{
		if(head.data==val)
			return head.next;
		
		Node curr=head;
		while(curr.next.data!=val && curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		return head;
		
	}
	
	public static void printLinkedList(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
	}

}
