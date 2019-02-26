package LInkedListMiddle;

public class LinkedList {
     Node head;
     
     class Node{
    	 int data;
    	 Node next;
    	 Node(int d){
    		 data = d;
    		 next= null;
    	 }
     }
     
     public void printMid() {
    	 Node slowptr = head, fastptr = head;
    	 if (head!= null) {
    		 while (fastptr!=null && fastptr.next!= null) {
    			 //faster pointer traverse two node at a time
    			 fastptr=fastptr.next.next;
    			 //slower one node at a time
    			 slowptr=slowptr.next;
    		 }
    		 System.out.println("The middle element is [" +
                     slowptr.data + "] \n");
    	 }
     }
     
     
     public void push (int new_data) {
    	 
    	 Node new_node = new Node(new_data);
    	 new_node.next= head;
    	 head=new_node;
     }
     
     
     public void PrintLink() {
    	 
    	Node tnode = head;
    	while(tnode!=null) {
    		System.out.println(tnode.data + "->");
    		tnode= tnode.next;
    	}
    	
    		System.out.println("NULL");
    	 
    	 
     }
     public static void main(String [] args)
     {
         LinkedList llist = new LinkedList();
         for (int i=5; i>0; --i)
         {
             llist.push(i);
             llist.PrintLink();
             llist.printMid();
         }
     }
 
     
     
}



