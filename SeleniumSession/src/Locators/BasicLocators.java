package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
				
		WebElement enterEmailid = driver.findElement(By.id("email"));
		enterEmailid.click();
		enterEmailid.sendKeys("revathycg1990@gmail.com");
		enterEmailid.clear();
		WebElement enterPassword = driver.findElement(By.name("pass"));
		enterPassword.sendKeys("apple");
		
		WebElement button = driver.findElement(By.className("42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		button.click();
	}

}
