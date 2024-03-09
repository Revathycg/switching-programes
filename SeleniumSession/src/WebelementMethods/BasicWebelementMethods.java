package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		//WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
//		//login.getText();
	WebElement signinButton=driver.findElement(By.xpath("//button[@name='login']"));
	String buttonlabel=signinButton.getText();
	System.out.println(buttonlabel);
		WebElement text=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String facebooktext=text.getText();
		System.out.println(facebooktext);
	}

}
