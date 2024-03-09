package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		checkbox1.isSelected();
		//boolean checkbox1status=checkbox1.isSelected();
		checkbox2.isSelected();
		//boolean checkbox2status=checkbox2.isSelected();
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox2.isSelected());
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox2.isDisplayed());

}
}