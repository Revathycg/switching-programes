package KeyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get(" https://the-internet.herokuapp.com/hovers");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement search= driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
				Actions actions=new Actions(driver);
				actions.moveToElement(search).build().perform();
				WebElement text= driver.findElement(By.xpath("//h5[contains(text(),'name: user1')]"));
				String a=text.getText();
				System.out.println(a); 
	}

}
