package week3.day2;

public class ButtonWebElement extends WebElement {
	//implemented Method
	public void Submit() {
		System.out.println("Click Submit");
	}

	public static void main(String[] args) {
		ButtonWebElement button=new ButtonWebElement();
		button.Submit();

	}

}
