package LinkedListDelete;



public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */

		new_node.next = head;

		/* 4. Move the head to point to new Node */

		head = new_node;
	}

	
	// delete the first node
	
	public void deleteFront()
	{
	// if (head!=null)
	 //head = head.next;
		//  creating the temporary node which points to the head node
		Node temp = head;
		// check temp node is not null 
		if(temp!= null) {
			// move the head node points to the next node 
			head =temp.next;
			// dispose the temp node 
			temp.next=null;
		}
	}
	
	
	// delete at the end of the list
	
	// traverse the list and while traversing maintain the previous address also ,
	//by the time we reach the end of the list we  will have two pointeers pointing to end node and
	// other pointing to the node before the end node
	
	public void deleteEnd() {
        Node curr = head;
        Node prev = null;
        if(curr == null){
           return;
        }
        if (curr.next == null){
           head = null;
           return;
        }
        
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        // updating the previousnode next pointing to null 
        prev.next = null;
    }
	
	
	 /* Given a key, deletes the first occurrence of key in linked list */
    void deleteNodekey(int key)
    {
        // Store head node
        Node curr = head;
        
        	Node prev = null;
 
        // If head node itself holds the key to be deleted
        if (curr != null && curr.data == key)
        {
            head = curr.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (curr != null && curr.data != key)
        {
            prev = curr;
            curr = curr.next;
        }    
 
     
 
        // Unlink the node from linked list
        prev.next = curr.next;
    }
    
    
    
    /* Given a reference (pointer to pointer) to the head of a list
    and a position, deletes the node at the given position */
 void deleteNodePosition(int position)
 {
	 
	// Store head node
     Node temp = head;

     // If linked list is empty
     if (temp == null)
         return;

     
     // If head needs to be removed
     if (position == 0)
     {
         head = temp.next;   // Change head
         return;
     }

     // Find previous node of the node to be deleted
     for (int i=0; temp!=null && i<position-1; i++)
         temp = temp.next;

     // If position is more than number of ndoes
     if (temp == null || temp.next == null)
         return;

     // Node temp->next is the node to be deleted
     // Store pointer to the next of node to be deleted
     Node next = temp.next.next;

     temp.next = next;  // Unlink the deleted node from list
 }
	
	/*

	This function prints contents of linke list starting from the given node*/

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	/*
	 * Driver program to test above functions. Ideally this function should be in a
	 * separate user class. It is kept here to keep code compact
	 */
	public static void main(String[] args) {
		/* Start with the empty list */
		LinkedList llist = new LinkedList();

 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
 
        llist.deleteNodePosition(0);  // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 4: ");
        llist.printList();
 	//llist.deleteFront();
		//llist.deleteEnd();
		llist.deleteNodekey(2);
		System.out.println("\nCreated Linked list key is: ");
		 llist.printList();
	}
}
