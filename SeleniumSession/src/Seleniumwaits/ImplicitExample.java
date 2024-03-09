package Seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement startbutton = driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
				startbutton.click();				
				WebElement message = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		String a=message.getText();
		System.out.println(a);
	}

}
