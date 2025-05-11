package week3.day2;
//sub Class
public class Edge extends Browser {
	//Define Method
	public void takeSnap() {
		System.out.println("Screen shot has been taken");
	}
	//Define Method
	public void clearCookies()
	{
		System.out.println("The viewed history has been cleared");
	}
	//Main Method
public static void main(String[] args) {
	Edge e=new Edge();
	e.openurl();//Applied from browser class
	e.takeSnap();//applied from Edge class
	e.clearCookies();//applied from edge class
	

}
}
