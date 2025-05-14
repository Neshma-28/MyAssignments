package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	// Function to find intersection of two arrays
    public static List<Integer> Intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                // If found, check if the element is already in the result
                if (a[i] == b[j]) {
                    if (!result.contains(a[i])) {
                        result.add(a[i]);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {3,2,11,4,6,7};
        int[] b = {1,2,8,4,9,7};
        System.out.println("Intersection values are:");
        List<Integer> result = Intersection(a, b);

        for (int value : result) {
        	
            System.out.print(value + " ");
        }
	}

}
