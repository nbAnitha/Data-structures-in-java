package Array;

import java.util.Random;

public class Reservoirsamplerandomnumber {
   
	public  Random random;
     
     public Reservoirsamplerandomnumber() {
		this.random = new Random();
	}
	
     
	public  void solve(int[] nums, int k) {
		
		//creating the new array for the k item 
		int[] reservoir = new int[k];
		
		//copy the first k iteam from the orginal array 
		for(int i=0; i<reservoir.length;i++)
			reservoir[i]=nums[i];
		//we consider the iteam from the original array
		//k+1 becouse we already copied k items
		// the i-th item is chosen to be included in the reservoir with probability k/i
		for(int i=k+1; i<nums.length; i++) {
			int j= random.nextInt(i)+1;
			if(j<k)
				reservoir[j]= nums[i];}
		// show the k random items
		for(int i=0; i<reservoir.length;i++) {
		System.out.println(reservoir[i] + " ");
		}
	}
	
public static void main(String args[]) {
	
	int nums[]= {33,13, 44, 66, 99, 44, 88, 77, 6, 7, 9};
	int k =2;
	Reservoirsamplerandomnumber Reservoirsamplerandomnumber = new Reservoirsamplerandomnumber ();
	Reservoirsamplerandomnumber.solve(nums, k);
}
}
