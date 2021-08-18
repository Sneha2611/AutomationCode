package Collections;

public class SinglyLinkedList {

 Node head;
	
 static class Node{
	
	int data;
	Node next;


Node(int data)
{
	this.data = data;
	next = null;
}
}

public void print()
{
	
	Node n = head;
	while(n != null)
	{
		System.out.println(n.data);
		n= n.next;
		
	}
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList ll = new SinglyLinkedList();
		
		Node first = new Node(100);
		ll.head = first;
		
		Node second = new Node(200);
		first.next = second;
		
		Node third = new Node(300);
		second.next = third;
		
		ll.print();

	}

}
