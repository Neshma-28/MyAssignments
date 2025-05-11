package week3.day2;
//Super Class
public class Browser {
	//Defined Local variable
	String browser1="Chrome";
	String browser2="Edge";
	String browser3="Safari";
	String browserName= browser1+" "+browser2+" "+browser3;
	float Browserversion=91.0F;
	//Define Method
	public void openurl() {
	
	System.out.println(browserName);
			
	}
	//Define Method
	public void closeBrowser() {
		System.out.println("Browser Closed");
	}
	//Define Method
public void navigateBack() {
	System.out.println("Navigate back to url page");
}
}
