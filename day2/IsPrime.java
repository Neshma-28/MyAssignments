package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		  int num = 13;
	      System.out.println("The given number is: " + num);
	      // initial count of factors
	      int n = 0;
	      // checking number of factors
	         for(int i = 1; i <= num; i++) {
	            if(num % i == 0) {
	               n++;
	            }
	         }
	         // checking number of counts to print result
	         if(n == 2) {
	            System.out.println(num + " is a prime number");
	         } else {
	            System.out.println(num + " is not a prime number");
	         }
	}
	}


