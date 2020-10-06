package TestNG;

import org.testng.annotations.Test;
//@Test method annotation
public class TestAnnotation {
	 
	@Test(invocationTimeOut=1)
	public void m1(){
		System.out.println("Hello m1 method is here");
	}
	@Test(invocationCount=4)
	public void m2(){
		System.out.println("Hello m2 method is here");
	}
	@Test(enabled=true)
	public void m3(){
		System.out.println("m3");
	}
	@Test(enabled=false)
	public void m4(){
		System.out.println("m4");
	}
	@Test(threadPoolSize=2)
	public void m5(){
		System.out.println("m5");
	}
	@Test(priority=1)
	public void m6(){
		System.out.println("m6");
	}
}
