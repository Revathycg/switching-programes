package SeleniumRevision;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuickReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parentwindow=driver.getWindowHandle();//window switching
		Set<String>windows=driver.getWindowHandles();
		for(String childwindow:windows) {
			
			
			List<WebElement>All=driver.findElements(By.xpath("//input[@name='webform']"));//list of elements
			for(WebElement alloptions:All) {
				System.out.println(alloptions.isSelected());
				
				
				
				driver.switchTo().alert().accept();//alert
				
				
				/ul[@class='top-menu']/li/a     //list of options
				
				Select select=new Select(dropdown);//dropdown selection
				
				
				WebElement alaska = driver.findElement(By.xpath("(//span[text()='Alaska'])[1]"));//don have select tag
				alaska.click();
				WebElement option = driver.findElement(By.xpath("//li[text()='"+state+"']"));
				
				
				List<String>namelist=new ArrayList<String>();
				 List<String>data=new ArrayList<String>();
				 for(WebElement element : elements){ 
					 data.add(element.getText());
			}
		}
	}

}
