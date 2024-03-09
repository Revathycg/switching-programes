package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		WebElement image = driver.findElement(By.xpath("//h1[contains(text(),'Drag the image into the box')]"));
		String text1=image.getText();
		System.out.println(text1);
	}

}
