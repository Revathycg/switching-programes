package WebelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SubmitForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(" https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstname.sendKeys("revathy");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname.sendKeys("cg");
		WebElement job = driver.findElement(By.xpath("//input[@id='job-title']"));
		job.sendKeys("engineer");
		WebElement education = driver.findElement(By.xpath("//input[@id='radio-button-3']"));
		 education.click();
		 WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		 checkbox.click();
		 WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		 Select select=new Select(options);
			select.selectByIndex(4);
			 WebElement submit = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']"));
			 submit.click();
			 WebElement message = driver.findElement(By.xpath("//h1[@align='center']"));
			String a= message.getText();
			System.out.println(a);
			 
			 
	}

}
