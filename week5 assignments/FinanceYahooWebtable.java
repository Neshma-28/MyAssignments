package week5assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahooWebtable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click from market to click crypto tab
		WebElement cryptoTab = driver.findElement(By.xpath("//span[@class='_yb_1ad2758' and text()='Markets']"));
        cryptoTab.click();
      //Click on the crypto tag 
        WebElement cryptoTab1 = driver.findElement(By.xpath("//span[@class='ellipsis yf-x2pyjv' and text()='Crypto']"));
        cryptoTab1.click();

        // Wait for the table to load
        Thread.sleep(3000); 

        // Locate the table
        WebElement table = driver.findElement(By.xpath("//table"));

        // Get all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        //for loop
        for (int i = 1; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            List<WebElement> columns = row.findElements(By.tagName("td"));

           
            if (columns.size() > 1) {
                String name = columns.get(1).getText(); 
                System.out.println("Cryptocurrency Name: " + name);
            }
        }

    } 
    	
		

		   
		    
		           
		        
		    
		

		  
	}

	

