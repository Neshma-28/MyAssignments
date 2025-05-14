package week3.day1;

public class MissingElement {

public static int findMissingLetter(int[] input) {
	int num = input.length + 1;
	//for loop
    for (int i = 1; i <= num; i++) {
        boolean inputnum = false;
        for (int j = 0; j < num - 1; j++) {
            if (input[j] == i) {
                inputnum = true;
                break;
            }
        }
        // if the current number is not present
        if (!inputnum)
            return i;
    }
    return -1;
}

	    public static void main(String[] args) {
	      int[] input= {1, 4,3,2,8, 6, 7};  
	        System.out.println("Missing number in {1,4,3,2,8,6,7}: " + findMissingLetter(input)); // Output: c

	}
	   
	    }

