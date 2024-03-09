package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableAndDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demowebshop.tricentis.com/login ");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.isEnabled());
		WebElement rememberme = driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]"));
		System.out.println(rememberme.isDisplayed());
	}

}
