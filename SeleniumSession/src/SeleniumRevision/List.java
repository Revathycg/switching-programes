package SeleniumRevision;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		List menu=(List) driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		for(WebElement element:menu) {
			System.out.println(element.getText());
		}
	}

}
