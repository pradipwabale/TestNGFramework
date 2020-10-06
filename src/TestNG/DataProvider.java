package TestNG;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider="LoginDataProvider")
public void m1(String uname, String upass){
	System.out.println(uname+"/"+upass);
}
	@Test(dataProvider="LoginDataProvider") 
	public Object[][] loginData(){
		Object[][] values={{"user1","user2"},{"user3","user4"},{"user5","user6"}};
			
		return values;
		}
 	}

