package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
//WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
//search.sendKeys("mobile");
//WebElement enterName=driver.findElement(By.name("field-keywords"));
//enterName.sendKeys("bag");
//enterName.clear();
//WebElement All=driver.findElement(By.cssSelector("#searchDropdownBox"));
//All.click();
//WebElement search1 = driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
//search1.sendKeys("tv");
WebElement search=driver.findElement(By.tagName("select"));
search.click();

	}

}
