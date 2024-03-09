package SeleniumRevision;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button= driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		button.click();
		String parentwindow=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		for(String childwindow:windows) {
		if(parentwindow.equals(windows)) {
			
		}
		else {
			driver.switchTo().window(childwindow);
		}
	
		
		

}
		System.out.println(driver.getTitle());
		
		}
}