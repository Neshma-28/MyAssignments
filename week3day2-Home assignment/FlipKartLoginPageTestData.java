package week3.day2;

public class FlipKartLoginPageTestData extends TestData {
	public void  enterUsername() {
		System.out.println("Enter the Flipkart UserName");
	}
public void enterPassword()
{
	System.out.println("Enter the Flipkart Password");
}
	public static void main(String[] args) {
		FlipKartLoginPageTestData data1=new FlipKartLoginPageTestData();
		System.out.println("Welcome to Flipkart Login Page");
		data1.enterUsername();
		data1.enterPassword();
		data1.navigateToHomePage();
		
}
		

	}
