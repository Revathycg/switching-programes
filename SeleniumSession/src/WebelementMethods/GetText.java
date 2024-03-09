package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		WebElement gettext1 = driver.findElement(By.xpath("//h1[contains(text(),'Complete Web Form')]"));
		String webform=gettext1.getText();
		System.out.println(webform);
		WebElement gettext2 = driver.findElement(By.xpath("//label[contains(text(),'First name')]"));
		String name=gettext2.getText();
		System.out.println(name);
	}

}
