package Switching;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement click= driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		click.click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
	Set<String> windows=driver.getWindowHandles();
	
		System.out.println(windows.size());
		System.out.println(driver.getTitle());//before switching
	
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext()){
			String member=itr.next();
			if(parentwindow.equals(member)) {
			
	}
			else {
				driver.switchTo().window(member);
			}
		}
		WebElement window= driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
		System.out.println(window.getText());
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
	}

}
