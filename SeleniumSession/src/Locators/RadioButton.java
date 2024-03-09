package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton ");
		driver.manage().window().maximize();
		WebElement button2 = driver.findElement(By.xpath("//label[contains(text(),'Radio button 2')]//preceding-sibling::input "));
	
	button2.click();
	WebElement button1 = driver.findElement(By.xpath("//label[contains(text(),'Radio button 1')]//preceding-sibling::input "));
	button1.click();
	}

}
