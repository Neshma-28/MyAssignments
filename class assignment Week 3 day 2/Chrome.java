package week3.day2;
//Sub Class
public class Chrome extends Browser{
	//Define Method
	public void openIncognito() {
	System.out.println("Opened chrome url");
}
	//Define Method
	public void clearCache() {
		System.out.println("Cache Cleared");
	}
	//Main Method
	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.openurl();//Applied from Browser class
		c.clearCache();//Applied from Chrome class
		c.openIncognito();//Applied from Chrome class
		
	}
}
