package WebelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement click1= driver.findElement(By.xpath("//a[contains(text(),'Click here')]"));
		click1.click();
				WebElement message= driver.findElement(By.xpath("//div[@class='flash notice']"));
		String a=message.getText();
		System.out.println(a);
		
		
	}

}
