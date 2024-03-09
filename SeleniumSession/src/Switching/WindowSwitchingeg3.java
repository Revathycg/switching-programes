package Switching;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingeg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button= driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		button.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for(String childwindow:windows) {
			if(parentwindow.equals(childwindow)) {
				
			}
			else {
				driver.switchTo().window(childwindow);
			}
		}
			WebElement newtab= driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Formy')]"));
			System.out.println(newtab.getText());
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parentwindow);
		
	}

}
