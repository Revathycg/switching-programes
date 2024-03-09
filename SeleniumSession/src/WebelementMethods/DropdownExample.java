package WebelementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(dropdown);
		
		select.selectByIndex(7);

////		select.selectByValue("search-alias=aps");
////		select.selectByVisibleText("Alexa Skills");
//		List<WebElement> options=select.getOptions();
//		for(WebElement options1:options) {
//			String a=options1.getText();
//			System.out.println(a);
//			options.size();
//			
			
		}
	}


