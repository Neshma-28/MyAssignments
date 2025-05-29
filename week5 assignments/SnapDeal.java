package week5assignment;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//mousehover for men's fashion
		WebElement mouseHover = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(mouseHover).perform();
		
		//click on sports shoes
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		
		//count of shoes
		WebElement countofshoe = driver.findElement(By.xpath("//div[@class='sub-cat-count ']"));
		System.out.println("Total count of Sport Shoes:"+" "+countofshoe.getText());
		
		//click on training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		 
	   //Set<String> Window=driver.getWindowHandles();
		//using List webelement for  prices of traing shoes sort 
		 List<WebElement> prices = driver.findElements(By.xpath("//span[@class='lfloat product-price' and @display-price]"));
		//System.out.println(prices);
		
		List<Integer> list=new ArrayList<Integer>();
		for (WebElement priceshoe : prices) {
			String priceofshoe = priceshoe.getText();
			String replaceAll = priceofshoe.replaceAll("[^0-9]", "");
			//String replaceAll1=text.replaceAll(",", " ");
			
			
			int price = Integer.parseInt(replaceAll);
			
			//System.out.println(text);
			list.add(price);
		}
		Collections.sort(list);
		System.out.println("The Sorted Price of Training Shoes:"+" "+ list);
		WebElement sort = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		sort.click();
			driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
			
		//number between the range of 500 to 700
		List<WebElement> sortrange = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
            driver.findElement(By.name("fromVal")).clear();
            driver.findElement(By.name("fromVal")).sendKeys("500");
            driver.findElement(By.name("toVal")).clear();
            driver.findElement(By.name("toVal")).sendKeys("700");
            driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
            Thread.sleep(2000);
            
            //color preferences of the shoe with white and blue combination
            WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
            color.click();
            
            //mousehover for quickview
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement mousehoverquickview = driver.findElement(By.xpath("(//section[@class='js-section clearfix dp-widget dp-fired'])/div"));
   		Actions act=new Actions(driver);
   	    act.moveToElement(mousehoverquickview).perform();
    	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    
    	    //firstshoe in quickview
    	   WebElement firstShoeQiuckview = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));
            firstShoeQiuckview.click();
            //cost
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
            //cost and discount details
         String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        		
       System.out.println("The cost of the shoe is:"+cost);
       String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		
       System.out.println("The discount Price of the shoe is:"+discount);
      Set<String> ChildWindow=driver.getWindowHandles();
       
       //mainwindow in List
       List<String> mainWindow = new ArrayList<String>(ChildWindow);
       for (int i = 0; i < mainWindow.size(); i++) {
       	String Window=mainWindow.get(i);
       driver.switchTo().window(Window);
       
      //Take the screenshot
       TakesScreenshot screenshot = (TakesScreenshot) driver; // Cast WebDriver to TakesScreenshot
       File source = screenshot.getScreenshotAs(OutputType.FILE);
       System.out.println("screenshot has been taken"+source);
       driver.close();
       System.out.println("Closed the current window");

       System.out.println("closed the main window");      
	
    

    }
	}
	}

            
		
	
	

	
			
		
	
            




