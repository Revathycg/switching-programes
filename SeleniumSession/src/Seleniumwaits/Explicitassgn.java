package Seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitassgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
		button.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Enable')]")));
		WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
		
		String a=message.getText();
		System.out.println(a);
	}

}
