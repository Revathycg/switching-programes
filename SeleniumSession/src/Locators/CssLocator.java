package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		search.sendKeys("tv");
		WebElement dropdown = driver.findElement(By.tagName("select"));
		dropdown.click();
	}

}
