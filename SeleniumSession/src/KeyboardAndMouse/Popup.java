package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/entry_ad");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		WebElement message= driver.findElement(By.xpath("//h3[contains(text(),'This is a modal window')]"));
	
		System.out.println(message.getText());
		
		WebElement close= driver.findElement(By.xpath("//p[contains(text(),'Close')]"));
		close.click();
	}

}
