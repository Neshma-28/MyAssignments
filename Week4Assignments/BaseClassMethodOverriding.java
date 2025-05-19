package week4.day1;
//superclass
public class BaseClassMethodOverriding {
	//Implemented Method1
	public void  findElement() {
		System.out.println("Find the Element");
	}
	//Implemented Method2
	public void clickElement() {
		System.out.println("Click the Particular Element");
	}
	//Implemented Method3
	public void  enterText() {
		System.out.println("Enter the text of that Element of LoginPage");
	}
	//Implemented Method4
	public void performCommonTasks() {
		System.out.println("Create Xpath for that Element");
	}
public static void main(String[] args) {
	////object created for main class for the superclass
	BaseClassMethodOverriding base=new BaseClassMethodOverriding();
	base.findElement();
	base.clickElement();
	base.enterText();
	base.performCommonTasks();
}
}
