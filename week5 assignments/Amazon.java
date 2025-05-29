package week5assignment;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//Price Details
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println("Price of first product: ₹" + price.getText());
		
		//Ratings
		WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
 		System.out.println("Rating Number of the First product"+ratings.getText());
 		
 		//By clicking the pictures with using window handle
        driver.findElement(By.xpath("//span[text()='(Refurbished) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)']")).click();
        Set<String> ChildWindow=driver.getWindowHandles();
        
        //mainwindow in List
        List<String> mainWindow = new ArrayList<String>(ChildWindow);
        for (int i = 0; i < mainWindow.size(); i++) {
        	String Window=mainWindow.get(i);
        	driver.switchTo().window(Window);
        }
       //Take the screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver; // Cast WebDriver to TakesScreenshot
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        System.out.println("screenshot has been taken"+source);
        
        //add to cart
        WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addtocart.click();
        
        //subcart total
        WebElement cartsubtotal = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        System.out.println("Cart subtotal"+" " + cartsubtotal.getText());

	}
}




















