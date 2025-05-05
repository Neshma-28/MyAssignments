package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//retrieve Title
		String title = driver.getTitle();
		System.out.println(title);
		//Create New Account
		driver.findElement(By.linkText("Create new account")).click();
		//FirstName
        driver.findElement(By.name("firstname")).sendKeys("Neshma");
        //Surname
		driver.findElement(By.name("lastname")).sendKeys("KG");
		//Email Address
		driver.findElement(By.name("reg_email__")).sendKeys("neshma.tsm@gmail.com");
		//New Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("vihaan");
		// Dob using call by value for date
	    WebElement DOB = driver.findElement(By.id("day"));
	    Select dob=new Select(DOB);
		dob.selectByValue("28");
		//Call by Text for month
		WebElement DOB1 = driver.findElement(By.id("month"));
	    Select dob1=new Select(DOB1);
        dob1.selectByVisibleText("Jun");
        //call by value for year
        WebElement DOB3 = driver.findElement(By.id("year"));
	    Select dob3=new Select(DOB3);
		dob3.selectByValue("1992");
	    // Gender Option using click method
		WebElement radioButton =  driver.findElement(By.id("sex"));
		radioButton.click();

}
}
