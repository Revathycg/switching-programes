package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String x=logo.getAttribute("Title");
		System.out.println(x);
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		WebElement circle1 = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		String y=circle1.getAttribute("Title");
		System.out.println(y);
		
	}

}
