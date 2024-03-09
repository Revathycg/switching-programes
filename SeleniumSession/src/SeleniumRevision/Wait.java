package SeleniumRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement start = driver.findElement(By.xpath("//a[contains(text(),'Click here')]"));
		start.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flash notice']")));
		WebElement text = driver.findElement(By.xpath("//div[@class='flash notice']"));
		System.out.println(text.getText());
	}
	}


