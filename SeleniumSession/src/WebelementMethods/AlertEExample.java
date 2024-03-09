package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlertEExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement jsalert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsconfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsprompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		jsalert.click();
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		jsconfirm.click();
		String confirm=driver.switchTo().alert().getText();
		System.out.println(confirm);
		driver.switchTo().alert().dismiss();
		jsprompt.click();
		String prompt=driver.switchTo().alert().getText();
		System.out.println(prompt);
		driver.switchTo().alert().sendKeys("revathy");
		driver.switchTo().alert().accept();
	}

}
