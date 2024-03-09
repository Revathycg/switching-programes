package WebelementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListcolorAndValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(" https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		List<WebElement> menuElements=driver.findElements(By.xpath("//button[@type='button']"));
		for(WebElement element:menuElements) {
			String a=element.getCssValue("background-color");
			System.out.println(a);
			String b=element.getText();
			System.out.println(b);
		}
	}

}
