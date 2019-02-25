package Array;

public class Array_operation {
	
	public static void main (String args[]) {
		
		int[] num = new int[5];
		
		for(int i=0; i<num.length;i++)
			num[i]=i;
		//0(1)
		int nums = num[4];
		System.out.println(nums);
		
		//if u want to find the value 
		//0(n) linear search/0(logn)binary search/0(1) using the hash table 
		for(int i=0;i<num.length; i++)
			if(num[i]==2) {
				System.out.println(i);
			}
				
		
		
		
}}
