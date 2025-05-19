package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		Integer[] num= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> listnum = Arrays.asList(num);
		//Sort the list using Collection
		Collections.sort(listnum);
		System.out.println("The Given Array is:{1, 2, 3, 4, 10, 6, 8}");
		System.out.println("The sorted list are:"+listnum);
		System.out.println("The Missing Elements are:");
		//Loop to compare the sequence
		 for (int i=0;i<listnum.size()-1; i++) {
			 // get() method to get an element from the list 
	            if (listnum.get(i)+1!=listnum.get(i+1)) {
	                for(int j = listnum.get(i)+1;j<listnum.get(i+1);j++){
	                    System.out.println(j);
		}

	}

		 }
	}
}
