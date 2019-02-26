package LinkedListRecursiveReverse;

public class LinkedList {

	// inner class is made it static so main() can access it
	static Node head;
	// inner class is made it static so main() can access it
	static class Node{
		int data;
		Node next;
	Node(int d){
		data= d;
	}
	}
	
	
	 Node recursiveReverse(Node curr, Node prv) {
		 
		 if(curr.next == null) {
			 head=curr;
			 curr.next=prv;
			 return null;
		 }
		 
		 Node next1 = curr.next;
		 curr.next= prv;
		 recursiveReverse(next1,curr);
		 return head;
		
		
	}
	 
	 void printlist(Node node) {
		 while (node!=null) {
			 System.out.println(node.data);
			 node= node.next;
		 }
		 
	 }
	 
	 
	 public static void main (String   args[])
	 {
		 LinkedList list = new LinkedList();
		 list.head = new Node(1);
		 list.head.next = new Node(6);
		 list.head.next.next = new Node(8);
		 list.head.next.next.next = new Node(10);
		 System.out.println("Original Linked list ");
	     list.printlist(head);
	        Node res = list.recursiveReverse(head, null);
	        System.out.println("");
	        System.out.println("");
	        System.out.println("Reversed linked list ");
	        list.printlist(res);
		 
		 
		 
		 
	 }
}
