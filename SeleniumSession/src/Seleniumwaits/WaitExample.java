package Seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		WebElement startbutton = driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
				startbutton.click();
				Thread.sleep(7000);
		WebElement message = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		String a=message.getText();
		System.out.println(a);
	}

}
