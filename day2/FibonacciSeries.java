package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, N=8;
		System.out.println("FIbanacci Series values are:\n");
		//loop statement
		for (int i = 0; i < N; i++) {
         // Print the number
         System.out.print(+n1 + " ");
          // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

	}


