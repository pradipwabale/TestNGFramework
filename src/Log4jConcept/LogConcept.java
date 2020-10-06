package Log4jConcept;

 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class LogConcept {
	
	public static Logger log=Logger.getLogger(LogConcept.class);
	 
	/*public Object getlogger(Object log){
		return log;
	}
	public void setlogger(Logger log){
		this.log=log;
		
	}*/
	
	
	@Test
	public void m1(){
	
		PropertyConfigurator.configure("log4j.properties");
		log.info("executrion started");
		System.out.println("url launch");
		log.error("url not found");

}
}
