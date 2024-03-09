package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(" https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		WebElement button2 = driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]"));
	button2.click();
	WebElement warning = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']"));
	warning.click();
	}

}
//label[contains(text(),'     Radio button 2   )]