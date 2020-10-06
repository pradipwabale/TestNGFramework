package Log4jConcept;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Demo {
	
	public static  Logger logger = LogManager.getLogger(Demo.class); 
	
	@Test
	public void m1(){
		
		//to generate log on console
		BasicConfigurator.configure();
		
		//to generate log file in project
		logger = Logger.getLogger("TestNGFramework");
		PropertyConfigurator.configure("log4j.properties");
		
		 System.out.println("start execution");
		 
		 logger.info("exe started");
		 logger.warn("execution get error");
		 logger.error("error detected");
		
		 System.out.println("execution stopped");
	}
	
	

}
