package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
	
		int input= 121, rNum=0, rem;
		int output=input;
	    
	    //for loop statement to check the condition
	    for (int i=input;i>0;i/=10){
	      rem = i % 10;
	      rNum = rNum * 10 + rem;
	     
	   }
	
	    // if else statement
	    if (output== rNum) {
	      System.out.println(output+ " is Palindrome.");
	    }
	    else {
	      System.out.println(output+ " is not Palindrome.");
	    }
	}
	}


