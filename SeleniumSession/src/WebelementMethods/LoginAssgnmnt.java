package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAssgnmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		System.out.println(username.isDisplayed());
		username.sendKeys("usr");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		System.out.println(password.isDisplayed());
		password.sendKeys("pwd");
		WebElement login = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
		login.click();
		WebElement errormessage = driver.findElement(By.xpath("//div[@id='flash-messages']"));
		System.out.println(errormessage.getText());
		System.out.println(errormessage.getCssValue("background-color"));
		
	}

}
