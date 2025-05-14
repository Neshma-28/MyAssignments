package week3.day2;
//Super Class
public class Browser {
	//Defined Local variable
	static String browser1="Chrome";
	static String browser2="Edge";
	static String browser3="Safari";
	static String browserName= "Chrome"+"Edge"+"Safari";
	 float Browserversion=91.0F;
	//Define Method
	public static String openurl1(String browser1) {
	
	System.out.println(browser1);
	return browser1;
			
	}
	public static String openurl2(String browser2) {
		
		System.out.println(browser2);
		return browser2;
				
		}
	public static String openurl3(String browser3) {
		
		System.out.println(browser3);
		return browser3;
				
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