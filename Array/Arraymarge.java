package Array;

public class Arraymarge {
		   public static void main(String[] args) {
		      int[]a = {1,2,3,4};
		      int[]b = {4,16,1,2,3,22};
		      
		      //length of a and b 
		      int[]c = new int[a.length+b.length];
		      int count = 0;
		      
		      for(int i = 0; i<a.length; i++) { 
		             c[i] = a[i];
		              count++; } 
		     
		      for(int j = 0;j<b.length;j++) { 
		         c[count++] = b[j];
		      } 
		      
		      for(int i = 0;i<c.length;i++){
		         System.out.print(c[i]+" ");
		         
		         int[] d = new int[c.length];
		         d[i] = c[c.length -1-i];
		          System.out.println(d[i]+"  ");
		     
		      }
		   } 
		
		 /*  public static int[] reverseInPlace(int[] x) {
			    int tmp;    

			    for (int i = 0; i < x.length / 2; i++) {
			        tmp = x[i];
			        x[i] = x[x.length - 1 - i];
			        x[x.length - 1 - i] = tmp;
			    }
			    return x; // for completeness, not really necessary.
			}
			
			public static int[] reverse(int[] x) {

                 int[] d = new int[x.length];


                  for (int i = 0; i < x.length; i++) {
                   d[i] = x[x.length - 1 -i];
                        }
                   return d;
                          }
//merging-two-sorted-singly-linked-list
 * 
Node MergeLists(Node list1, Node list2) {
  if (list1 == null) return list2;
  if (list2 == null) return list1;

  if (list1.data < list2.data) {
    list1.next = MergeLists(list1.next, list2);
    return list1;
  } else {
    list2.next = MergeLists(list2.next, list1);
    return list2;
  }
}
		      */
		   
		   
		   
}
