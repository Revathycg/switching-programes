package KeyboardAndMouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadusingRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String filepath="C:\\excel2.xlsx";
		Robot robot =new Robot();
		Actions actions=new Actions(driver);
		actions.moveToElement(fileupload).click().build().perform();
		StringSelection ss = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_V);
		
}
}