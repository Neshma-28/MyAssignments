package week4.day2;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandleInteractionAutomation {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");    
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Username and password
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
		
        //create crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//click Contact
		driver.findElement(By.linkText("Contacts")).click();
		
		//  Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//widget opening for From contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

		//get windowHandle method for main window
		String mainWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
      // Click on the widget of the "From Contact"

       driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
       //Switchto method for mainwindow
       driver.switchTo().window(mainWindow);
       
       //widget opening for To contact
       driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        
        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        // Click on the widget of the "To Contact"
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
        //Switch to mainwindow
        driver.switchTo().window(mainWindow);
        //Click to Merge button
        driver.findElement(By.linkText("Merge")).click();  
        //Alert Accepted
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //To get the Title
        String title1 = driver.getTitle();
        if (title1.contains("Merge Contact")) {
            System.out.println("Title Matched"+title1);
        } else {
             System.out.println("Title not matched"+ title1);
        }

        //Close the browser
        driver.quit();

        
        
        }
			
		
	}



