package Log4jConcept;

 
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class DependOnMethod extends Demo {
	WebDriver driver;
	
	//use any on object of logger class
	//public static Logger logger = LogManager.getLogger(DependOnMethod.class);
	public static Logger loger = Logger.getLogger(DependOnMethod.class);

	@Test
	public void m1() {

		// to generate log on console
		BasicConfigurator.configure();

		// to generate log file in project
		logger = Logger.getLogger("TestNGFramework");
		PropertyConfigurator.configure("log4j.properties");

		logger.info("load browser");
		System.setProperty("webdriver.chrome.driver", "E:\\java by avinash sir\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.reetree.in/?v=c86ee0d9d7ed");

		logger.info("browser load successfully");

	}

	@Test(dependsOnMethods = { "m1" })
	public void m2() {
		System.out.println(driver.getCurrentUrl());
		logger.warn("current url og browser print on console");

	}

	@Test(dependsOnMethods = { "m1" })
	public void m3() {

		Assert.assertEquals(driver.getTitle(), "REETREE - Your Online Shopping Hub");
		System.out.println(driver.getTitle());

		logger.info("title of webpage print on console");
	}

	@AfterTest
	public void m4() {
		System.out.println(driver.getWindowHandle());

		logger.fatal("string hashcode of current window printed on console");

	}

}
