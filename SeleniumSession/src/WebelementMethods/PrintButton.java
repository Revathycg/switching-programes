package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		WebElement button1 = driver.findElement(By.xpath("//input[@value='option1']"));
		Boolean x=button1.isSelected();
		System.out.println(x);
		WebElement button2 = driver.findElement(By.xpath("//input[@value='option2']"));
		Boolean y=button2.isSelected();
		System.out.println(y);
		if(y==false)
			button2.click();
	}}