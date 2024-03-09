package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(" https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source= driver.findElement(By.xpath("//img[@src='/assets/selenium-logo-c1d6f4654a0c8f8bef745f71b4e22836224aabc2116f405ef511cd79c48f2947.png']"));
		WebElement destination= driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
	}

}
