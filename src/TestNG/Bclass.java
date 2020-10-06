package TestNG;

import org.testng.annotations.Test;

@Test
public class Bclass {
	@Test(groups={"Regression","Pradip"})
	public void m1(){
		System.out.println("m1 of class B");
	}
	@Test 
	public void m2(){
		System.out.println("m2 of class B");
	}
	@Test(groups={"Regression","Pradip"})
	public void m3(){
		System.out.println("m3 of class B");
	}
	@Test
	public void m4(){
		System.out.println("m4 of class B");
	}
	@Test(groups={"Pradip"})
	public void m5(){
		System.out.println("m5 of class B");
	}
	@Test(groups={"Pradip"})
	public void m6(){
		System.out.println("m6 of class B");
	}


}
