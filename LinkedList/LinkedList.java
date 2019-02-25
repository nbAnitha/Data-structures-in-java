package LinkedList;

// // A simple Java program for traversal of a linked list

public class LinkedList {

	Node head;

	// inner class is made it static so main() can access it
	static class Node {
		int data;
		Node next;

		// constructor
		public Node(int d) {
			data = d;
		}
	}

	// /* This function prints contents of linked list starting from head */
	public void PrintLink() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}

	}

	/* method to create a simple linked list with 3 nodes */
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;

		llist.PrintLink();

	}

}
