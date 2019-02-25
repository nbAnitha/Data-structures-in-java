package LinkedListLooporCycle;

public class LInkedLIst {
   Node head;
   public Node head() { return head;}

   static class Node{
	   String data;
		Node next;
	 
	   Node(String d){
		   data= d;
	   }
	   
	   @Override
       public String toString() {
           return this.data;
       }
   }
   
   @Override
   public String toString(){
       StringBuilder sb = new StringBuilder();
       Node current = head.next;
       while(current != null){
          sb.append(current).append("-->");
          current = current.next;
       }
       sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
      return sb.toString();
   }

   
   public void appendIntoTail(Node node) {
       Node current = head;
      
       //find last element of LinkedList i.e. tail
       while(current.next != null){
           current = current.next;
       }
       //appending new node to tail in LinkedList
      // current.setNext(node);
   }
  
   /*
    * If singly LinkedList contains Cycle then following would be true
    * 1) slow and fast will point to same node i.e. they meet
    * On the other hand if fast will point to null or next node of
    * fast will point to null then LinkedList does not contains cycle.
    */
   public boolean isCyclic(){
       Node fast = head;
       Node slow = head;
      
       while(fast!= null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
          
           //if fast and slow pointers are meeting then LinkedList is cyclic
           if(fast == slow ){
               return true;
           }
       }
       return false;
   }
  
   /**
   *
   * Java program to find if LinkedList contains loop or cycle or not.
   * This example uses two pointer approach to detect cycle in linked list.
   * Fast pointer moves two node at a time while slow pointer moves one node.
   * If linked list contains any cycle or loop then both pointer will meet some time.
   *
   * @author Javin Paul
   */
  

      public static void main(String args[]) {

          //creating LinkedList with 5 elements including head
    	  LInkedLIst linkedList = new LInkedLIst();
          linkedList.appendIntoTail(new LInkedLIst.Node("101"));
          linkedList.appendIntoTail(new LInkedLIst.Node("201"));
          linkedList.appendIntoTail(new LInkedLIst.Node("301"));
          linkedList.appendIntoTail(new LInkedLIst.Node("401"));

          System.out.println("Linked List : " + linkedList);

          if(linkedList.isCyclic()){
              System.out.println("Linked List is cyclic as it contains cycles or loop");
          }else{
              System.out.println("LinkedList is not cyclic, no loop or cycle found");
          }    

      } 
     
  }
 

   


   

