package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Danger");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123pass");
	driver.findElement(By.name("login")).click();
	
}
}