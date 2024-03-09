package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		WebElement button1 = driver.findElement(By.xpath("//div[@class='form-check']//label[1]"));
		String text1=button1.getText();
		System.out.println(text1);
		WebElement button2 = driver.findElement(By.xpath("//label[@for='radio-button-2']"));
		String text2=button2.getText();
		System.out.println(text2);
		WebElement button3 = driver.findElement(By.xpath("//label[@for='radio-button-3']"));
		String text3=button3.getText();
		System.out.println(text3);
	}

}
