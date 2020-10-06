package TestNG;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class LoginFbPage {
	 
	public static void fbUserId(){
	System.setProperty("webdriver.chrome.driver", "E:\\java by avinash sir\\WebDrivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.close();
	 
}
public static void fbUserId1(){
	System.setProperty("webdriver.firefox.driver", "E:\\java by avinash sir\\WebDrivers\\IEDriverServer.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.zomato.com/pune");
	driver.manage().window().maximize();
	driver.close();
	 
}}