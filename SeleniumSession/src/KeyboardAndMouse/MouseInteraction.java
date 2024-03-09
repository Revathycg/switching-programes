package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button= driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions actions=new Actions(driver);
		//actions.contextClick().build().perform();
		actions.contextClick(button).build().perform();
		WebElement cut= driver.findElement(By.xpath("//span[contains(text(),'Cut')]"));
		//actions.moveToElement(cut).click().perform();
	actions.click(cut).build().perform();
	driver.switchTo().alert().accept();
	actions.doubleClick().build().perform();
	WebElement button1= driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	actions.doubleClick(button1).build().perform();
	driver.switchTo().alert().accept();
	}

}
