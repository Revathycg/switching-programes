package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		WebElement options = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select select=new Select(options);
				select.selectByValue("1");
}}
