package KeyboardAndMouse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/radio.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement option= driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
			WebElement checkbox= driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
			Actions actions=new Actions(driver);
			actions.click(option).build().perform();
			actions.click(checkbox).build().perform();
			
			List<WebElement>All=driver.findElements(By.xpath("//input[@name='webform']"));
			for(WebElement alloptions:All) {
				System.out.println(alloptions.isSelected());
			}
	}

}
