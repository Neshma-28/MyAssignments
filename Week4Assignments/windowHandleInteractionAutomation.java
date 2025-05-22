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

			 Set<String> ChildWindow=driver.getWindowHandles();
	String mainWindow = driver.getWindowHandle();
	List<String> listWindow=new ArrayList<String>(ChildWindow);
	for (int i = 0; i <listWindow.size(); i++) {
		String Window=listWindow.get(i);
		driver.switchTo().window(Window);
		}
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	driver.switchTo().window(mainWindow);
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> ChildWindow1=driver.getWindowHandles();
	//String mainWindow1 = driver.getWindowHandle();*/
	List<String> listWindow1=new ArrayList<String>(ChildWindow1);
	for (int i = 0; i <listWindow1.size(); i++) {
		String Window1=listWindow1.get(i);
		driver.switchTo().window(Window1);
		}
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
	driver.switchTo().window(mainWindow);
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
   // driver.quit();
   }
    
	
}
