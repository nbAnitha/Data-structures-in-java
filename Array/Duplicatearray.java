package Array;

public class Duplicatearray {

	public static  void solve(int[] array) {
		
		
		//o(N) complexity
		
		          for(int i=0;i<array.length;i++){
			
			if (array[Math.abs(array[i])] > 0) {
				array[Math.abs(array[i])] = - array[Math.abs(array[i])];
				}
			
			else
				System.out.println(Math.abs(array[i])+  " is a repeted number");
		}
	}


public static void main(String args[]) {
	
	
	int[] array = {2,3,2,4,5};
	solve(array);
	
}
}
