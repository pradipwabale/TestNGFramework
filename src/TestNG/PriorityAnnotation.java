package TestNG;

import org.testng.annotations.Test;

public class PriorityAnnotation {
	@Test(priority=-5)
	public void m1(){
		System.out.println("priority=-5 ");
	}
	@Test(priority=-1)
	public void m2(){
		System.out.println("priority=-2");
	}
	@Test(priority=0)
	public void m3(){
		System.out.println(" priority=0");
	}
	@Test
	public void m4(){
		System.out.println(" Test Annotation");
	}
	@Test(priority=2)
	public void m5(){
		System.out.println("priority=2");
	}

}
