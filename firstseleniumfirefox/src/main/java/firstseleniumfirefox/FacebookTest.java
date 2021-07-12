package firstseleniumfirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\firefox\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
<<<<<<< HEAD
		driver.get("https://www.google.com");
=======
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
>>>>>>> refs/remotes/origin/master
		
		
	}

}
