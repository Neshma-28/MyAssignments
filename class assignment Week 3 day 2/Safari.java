package week3.day2;
//Sub Class
public class Safari extends Browser {
	//Define Method
	public void readerMode() {
		System.out.println("The Reader Mode is activated");
	
	}
	//Define Method
	public void fullScreenMode() {
		System.out.println("The full Screen Mode is Activated");
	}
	//Main Method
	public static void main(String[] args) {
		Safari s=new Safari();
		s.readerMode();//applied from Safari class
		s.fullScreenMode();//applied from Safari class
		s.closeBrowser();//applied from browser class
	}
}
