package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AttributeAndEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html  ");
		driver.manage().window().maximize();
		WebElement reset = driver.findElement(By.xpath("//input[@type='reset']"));
		System.out.println(reset.getAttribute("value"));
		WebElement circle1 = driver.findElement(By.xpath("//input[@id='yes']"));
		System.out.println(circle1.getAttribute("type"));
		WebElement circle2 = driver.findElement(By.xpath("//input[@id='no']"));
		System.out.println(circle2.getAttribute("type"));
	System.out.println(circle1.isEnabled());
	System.out.println(circle2.isEnabled());
	
	}

}
