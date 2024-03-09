package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Backgroundcolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement backgroundcolor = driver.findElement(By.xpath("//p[contains(text(),'My Trips')]"));
		String x=backgroundcolor.getCssValue("background-color");
		System.out.println(x);
	}

}
