package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {public static void main(String[] args){
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();	
	driver.findElement(By.id("username"))
	.sendKeys("democsr2");
	driver.findElement(By.id("password"))
	.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit"))
	.click();
	driver.findElement(By.partialLinkText("CRM"))
	.click();
	driver.findElement(By.linkText("Leads"))
	.click();
	driver.findElement(By.linkText("Create Lead"))
	.click();
	driver.findElement(By.id("createLeadForm_companyName"))
	.sendKeys("testleaf");
	driver.findElement(By.id("createLeadForm_firstName"))
	.sendKeys("seba");
	driver.findElement(By.id("createLeadForm_lastName"))
	.sendKeys("S");
	WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select sel = new Select(sourceDD);
	sel.selectByIndex(4);
	WebElement marketingDD =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select sel1 = new Select(marketingDD);
	sel1.selectByVisibleText("Automobile");
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select sel2 = new Select(industry);
	sel2.selectByValue("IND_SOFTWARE");
	driver.findElement(By.className("smallSubmit"))
	.click();
	driver.close();
}
}

