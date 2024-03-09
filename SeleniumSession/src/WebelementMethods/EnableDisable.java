package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		driver.manage().window().maximize();
		WebElement input1 = driver.findElement(By.xpath("//input[@id='disabledInput']"));
		System.out.println(input1.isEnabled());
		WebElement input2 = driver.findElement(By.xpath("//input[@id='input']"));
		System.out.println(input2.isEnabled());
		int x=input1.getLocation().getX();
		System.out.println(x);
		int y=input1.getLocation().getY();
		System.out.println(y);
		System.out.println(input1.getAttribute("class"));
	}

}
