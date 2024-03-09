package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(search).build().perform();
		Thread.sleep(3000);
		actions.release().build().perform();
		actions.sendKeys(search,"mobile").build().perform();
		actions.keyDown(search,Keys.BACK_SPACE).build().perform();
	}

}
