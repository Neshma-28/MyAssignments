package week3.day2;

public class AmazonLoginTestData extends TestData {
	public void  enterUsername() {
		System.out.println("Enter the Amazon UserName");
	}
public void enterPassword()
{
	System.out.println("Enter the Amazon Password");
}
	public static void main(String[] args) {
		AmazonLoginTestData data=new AmazonLoginTestData();
		System.out.println("Welcome to Amazon Login Page");
		data.enterUsername();
		data.enterPassword();
		data.navigateToHomePage();
		
}
		

	}


