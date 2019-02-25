package Array;

import java.util.Arrays;

public class Anagramarray {
	
	public static boolean solve(char [] s1, char[] s2) {
		
		if(s1.length!=s2.length)
			return false;
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i=0; i<= s1.length; i++) 
			if(s1[i]!=s2[i])
				return false ;
				
				else
					return true;
		return true;
				
		
		
	}
	
	public static void main(String args[]) {
		
		String a = "cinemq";
		char[] charArray = a.toCharArray();
		
		String b = "iceman";
		char[] charArray1 = b.toCharArray();
		
		
		System.out.println(solve(charArray, charArray1));
		
	
	



}}
