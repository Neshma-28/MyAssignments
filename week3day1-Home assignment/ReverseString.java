package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		//Given String
		String GivenLine="I am a software tester";
		//string reverseWords method
		String result=reverseWords(GivenLine);
		System.out.println(result.substring(1));

}
	public static String reverseWords(String string){
		//split the words
         String[] str=string.split(" ");
         String r="";
         // each word using loop
         for(int i=0;i<str.length;i++){
        	 if(i%2==1){
        		 str[i]=reverse(str[i]);
        	 }
        	 r=r+" "+str[i];
         }

		return r;

		}

	public static  String reverse(String string1){
			String rev="";
			//for loop to reverse
			for(int i=string1.length()-1;i>=0;i--){
				rev=rev+string1.charAt(i);
}
			return rev;
			

		}

		}

