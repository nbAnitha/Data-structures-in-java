package Array;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListnew {
	
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("anitha");
		list.add("bnitha");
		list.add("cnitha");
		//random acces 0(1)
		//arraylist is not synchronized
		System.out.println(list.get(0));
		
		for(String s: list) {
		
		System.out.println(s);
		}
		
		
	}

}
