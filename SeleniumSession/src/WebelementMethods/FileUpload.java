package WebelementMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String filepath="C:\\excel2.xlsx";
		//fileupload.sendKeys(filepath);
		File file=new File(filepath);
		//fileupload.sendKeys(file.getAbsolutePath());
	}

}
