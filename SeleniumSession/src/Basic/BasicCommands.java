package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com" );
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
	System.out.println(url);
	}

}
