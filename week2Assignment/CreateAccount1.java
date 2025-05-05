package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount1 {

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
		//To create Accounts
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("NeshmaKG1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//select by value
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		    Select select=new Select(industry);
			select.selectByValue("IND_SOFTWARE");
		//select by text
		WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
		    Select select1=new Select(ownership);
	        select1.selectByVisibleText("S-Corporation");
	     //select by value
			WebElement source = driver.findElement(By.id("dataSourceId"));
			    Select select3=new Select(source);
				select3.selectByValue("LEAD_EMPLOYEE");
		//Select by index
			WebElement marketingcompaign = driver.findElement(By.id("marketingCampaignId"));
			    Select select4=new Select(marketingcompaign);
				select4.selectByIndex(6);
		//select by value
			WebElement stateandprovince = driver.findElement(By.id("generalStateProvinceGeoId"));
				    Select select5=new Select(stateandprovince);
					select5.selectByValue("TX");
					//Click Method
			WebElement createaccount1 = driver.findElement(By.id("ext-gen745"));
				    createaccount1.click(); 
				    driver.close();
				
	}

}
