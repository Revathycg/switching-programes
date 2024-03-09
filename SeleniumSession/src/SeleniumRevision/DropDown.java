package SeleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		List<WebElement> menu=driver.findElements(By.xpath("//label[@class='form-check-label']//preceding-sibling::input"));
		for(WebElement alltext:menu) {
		System.out.println(alltext.isDisplayed());
	}

}}
