package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectKey {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
		Actions actions=new Actions(driver);
		actions.click(search).build().perform();
				actions.keyDown(search,Keys.ARROW_DOWN).build().perform();
		
	actions.keyDown(Keys.ENTER).build().perform();
		actions.sendKeys(Keys.ARROW_DOWN);
	}

}
