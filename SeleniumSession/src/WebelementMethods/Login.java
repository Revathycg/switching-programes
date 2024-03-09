package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html ");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("revathycg1990@gmail");	
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("automation");	
		WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signin.click();	
		WebElement message = driver.findElement(By.xpath("//h3[contains(text(),'Successfully Logged in...')]"));
		System.out.println(message.getText());	
}}
