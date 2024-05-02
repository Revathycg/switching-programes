package WebelementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		//WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu']/li/a"));
		//System.out.println(element.getText());
		List<WebElement> menuElements=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		int a=menuElements.size();
		System.out.println(a);	for(int i=0;i<menuElements.size();i++){
	String y=menuElements.get(i).getText();
//			System.out.println(y);
//			String z=menuElements.get(i).getTagName();
//			System.out.println(z);
//			String x=menuElements.get(i).getAttribute("href");
//			System.out.println(x);
		//}
		for(WebElement element1:menuElements) {
			String b=element1.getText();
			System.out.println(b);
		}
	}

}}
