package week4.day1;
//subclass
public class LoginPageMethodOverriding extends BaseClassMethodOverriding {
	//Implemented Method
	public void UserName() {
		System.out.println("User Name:");
	}
	//Implemented Method
	public void Password() {
		System.out.println("Password:");
	}
	//unImplemented Method
	//Override Method
public void performCommonTasks() {
	System.out.println("Overridden Method"+" "+"Click the Login Button");
}
	public static void main(String[] args) {
		//object created for main class for the subclass
		LoginPageMethodOverriding login=new LoginPageMethodOverriding();
		login.UserName();
		login.Password();
		login.performCommonTasks();
	}

}
