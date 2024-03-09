package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebelementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		String x=logo.getAttribute("class");
		System.out.println(x);
	
		
	}

}
