package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsspropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keralartc.com/");
		driver.manage().window().maximize();
		WebElement booknow = driver.findElement(By.xpath("//a[@class='btn-theme']"));
		String x=booknow.getCssValue("background-color");
		System.out.println(x);
		String y=booknow.getCssValue("color");
		System.out.println(y);
		String z=booknow.getCssValue("font-style");
		System.out.println(z);
		String a=booknow.getCssValue("font-size");
		System.out.println(a);
	}

}
