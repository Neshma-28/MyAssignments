package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		//String[] company={"HCL", "Wipro", "Aspire Systems", "CTS"} ;
		List<String> Company=new ArrayList<String>();
		//Add the strings into list
		Company.add("HCL");
		Company.add("Wipro");
		Company.add("Aspire Systems");
		Company.add("CTS");
		String[] str = new String[Company.size()];
		
		/*for (int i = 0; i < Company.size(); i++) {
          //  str[i] = Company.get(i);
        //}
	
		 //for (String output : str) {*/
		
		//swap the list using Collection
		Collections.swap(Company, 0, 1);
		Collections.swap(Company, 3, 2);
		System.out.println( Company);
		
		

	}

	}

