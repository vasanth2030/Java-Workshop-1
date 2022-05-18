package linkedlist;

public class LinkedlistMain {
	public static void main(String[] args) {
		Node head=new Node(10);
		Node.insertNodeAtEnd(head, 20);
		Node.insertNodeAtEnd(head, 30);
		Node.insertNodeAtEnd(head, 40);
		Node.insertNodeAtEnd(head, 50);
		Node.insertNodeAtEnd(head, 60);
		
		Node.printLinkedList(head);
		System.out.println();
		
		head=Node.deletePos(head, 1);
		Node.printLinkedList(head);
		System.out.println();
		
		head=Node.deleteValue(head, 20);
		Node.printLinkedList(head);
		System.out.println();
		
		head= Node.insertAtPos(head, 70, 3);
		Node.printLinkedList(head);
	}
}	
