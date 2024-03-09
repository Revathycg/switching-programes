package Switching;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement click= driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		click.click();
		
		String parentwindow=driver.getWindowHandle();
		//System.out.println(parentwindow);
		Set<String> windows=driver.getWindowHandles();
		for(String currentwindow:windows) {
			if((parentwindow.equals(currentwindow))){
				
			}
			else {
			driver.switchTo().window(currentwindow);
		}
			
		}
		WebElement window= driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
		System.out.println(window.getText());
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindow);
	}

}
