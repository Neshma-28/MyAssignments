package week3.day2;

public class TextFieldWebElement extends WebElement {
	public void getText() {
		//System.out.println(name);
	}

	public static void main(String[] args) {
		
		TextFieldWebElement text=new TextFieldWebElement();
		//call SuperClass
		text.setText("name");
	}

}
