package week3.day1;

public class RemoveDuplicateWords {
	public static String removeduplicate(String GivenText)
	    {
	        //convert the string and split
	        String[] count=GivenText.split(" ");
	        //for loop
	        for(int i=0;i<count.length;i++)
	        {
	            //check if already duplicate word is replaced with " "
	            if(count[i]!=" ")
	            {
	              //for loop
	                for(int j=i+1;j<count.length;j++)
	                {
	                	
						
	                    //if there is any duplicate word then make is " "
	                    if(count[i].equals(count[j]))
	                    {
	                        count[j]="  ";
	                        count[i]="  ";
	                    }
	                    
	                }
	            }
	        }
	            
	        
	        //for loop 
	        for(int k=0;k<count.length;k++)
	        {
	            //check if word is a null then don't print it
	            if(count[k]!=" ")
	            {
	                System.out.print(count[k]+" ");
	            }
	        }
			return GivenText;
	     
	    }

	    public static void main(String[] args) 
	    {
	    	System.out.println("We learn Java basics as part of java sessions in java week1");
	        String GivenText="We learn Java basics as part of java sessions in java week1";
	        RemoveDuplicateWords.removeduplicate(GivenText);
	    }
	
}



	
		

	
	


