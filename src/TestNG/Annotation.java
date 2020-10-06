package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 
public class Annotation {
	@BeforeSuite 
	public void m1(){
		System.out.println("m1 of class C");
	}
	@AfterSuite
	public void m2(){
		System.out.println("m2 of class c");
	}
	@BeforeTest 
	public void m3(){
		System.out.println("m3 of class c");
	}
	@AfterTest
	public void m4(){
		System.out.println("m4 of class c");
	}
	 @BeforeClass
	public void m5(){
		System.out.println("m5 of class c");
	}
	@AfterClass
	public void m6(){
		System.out.println("m6 of class c");
	}
	@Test(priority=1)
	public void m7(){
		System.out.println("m7 of class c");
	}


}
