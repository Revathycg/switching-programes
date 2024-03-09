package SeleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentLocators {
WebDriver driver;
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/radio.html");
driver.manage().window().maximize();
Actions action=new Actions(driver);
List<WebElement>All=driver.findElements(By.xpath("//input[@name='webform']"));
for(WebElement options:All) {
	boolean x=options.isSelected();
	System.out.println(x);
	if(x==false) {
		action.click(options).build().perform();
		
	}
}




}}
