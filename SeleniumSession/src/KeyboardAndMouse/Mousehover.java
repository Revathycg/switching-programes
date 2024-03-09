package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement enable= driver.findElement(By.xpath("//a[contains(text(),'Enabled')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(enable).build().perform();
		Thread.sleep(3000);
		WebElement downloads= driver.findElement(By.xpath("//a[contains(text(),'Downloads')]"));
		
		actions.moveToElement(downloads).build().perform();
	}
	}


