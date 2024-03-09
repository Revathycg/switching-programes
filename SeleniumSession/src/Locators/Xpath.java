package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("revathy");
		//tagName[@attribute='value']
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("revathy");
		WebElement login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		login.click();
		////span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']//input[@class='nav-input nav-progressive-attribute']
		//parent child xpath
	}

}
