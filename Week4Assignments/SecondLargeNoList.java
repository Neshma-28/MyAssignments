package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeNoList {

	public static void main(String[] args) {
		Integer[] num= {3, 2, 11, 4, 6, 7};
		System.out.println("The given no are:{3, 2, 11, 4, 6, 7}");
		//The Given array in the list
		List<Integer> listnum = Arrays.asList(num);
		//Sort the list using Collection
		Collections.sort(listnum);
		System.out.println("The Sorted List are:"+listnum);
		//to get second largest num in an list
		Integer secondLargeno = listnum.get(listnum.size() - 2);
		System.out.println("Second Largest No in the List is: "+secondLargeno);

	}

	

}
