package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath("//input[@id='target']"));
		search.sendKeys(Keys.ENTER);
		search = driver.findElement(By.xpath("//input[@id='target']"));
		search.sendKeys(Keys.SPACE);
		search = driver.findElement(By.xpath("//input[@id='target']"));
		search.sendKeys(Keys.ARROW_LEFT);
		
	}

}
