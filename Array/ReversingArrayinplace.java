package Array;

import java.util.Arrays;

public class ReversingArrayinplace {
	//reversing the array in place 
	
	public static void reverse (int[] input) {
		
		for (int i=0; i<input.length/2;i++) {
			
			int temp=input[i];
			
			input[i]=input[input.length-1-i];
			
			
			input[input.length-1-i]=temp;
			
		}
		
		
		
		System.out.println("reversed array : " + Arrays.toString(input));
	}
	
	public static void main(String args[]) {
		
		int[] L = {1,2,3,4};
		reverse(L);
	
		
		
	}
	
	
	 

}
