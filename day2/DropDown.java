package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//retrieve Title
		String title = driver.getTitle();
		System.out.println(title);
		//user Input
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//call by Index
	    WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select select=new Select(sourceDD);
		select.selectByIndex(4);
		
		//call by Text
		WebElement marketingcompaigndd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select select2=new Select(marketingcompaigndd);
        select2.selectByVisibleText("Automobile");
        
        //call by value
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership=new Select(ownershipDD);
		ownership.selectByValue("OWN_CCORP");
		//
		


	}

}
