package week3.day2;

public class RadioButtonWebElement extends ButtonWebElement {
	public void selectRadioButton() {
System.out.println("Radio Button is clicked");
	}

	public static void main(String[] args) {
		RadioButtonWebElement radio=new RadioButtonWebElement();
		radio.selectRadioButton();
		radio.Submit();
		
	}

}
