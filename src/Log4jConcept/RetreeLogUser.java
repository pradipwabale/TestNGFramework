package Log4jConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetreeLogUser extends LogConcept {

	WebDriver driver;

	@Test
	public void loadUrl() {
 
		 
		 
	     log.info("browser launch successfully");
		System.setProperty("webdriver.chrome.driver", "E:\\java by avinash sir\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.reetree.in/?v=c86ee0d9d7ed");

		 
	}

}
