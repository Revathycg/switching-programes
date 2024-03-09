package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		WebElement forgotPassword1 = driver.findElement(By.partialLinkText("Forgotten"));
		forgotPassword1.click();
	}

}
