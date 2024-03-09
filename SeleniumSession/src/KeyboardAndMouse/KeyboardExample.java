package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.sendKeys("mobile"+Keys.ENTER);
		//search.sendKeys("watch");
		//search.sendKeys(Keys.BACK_SPACE);
		//search.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//search.sendKeys(Keys.chord(Keys.CONTROL,"A"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
	}

}
