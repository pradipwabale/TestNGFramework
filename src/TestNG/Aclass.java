package TestNG;

import org.testng.annotations.Test;

// In testng.xml file group coding added so class A,B,C run simultaneously.
public class Aclass {
	@Test(groups={"Regression","Pradip"})
	public void m1(){
		System.out.println("m1 of class A");
	}
	@Test
	public void m2(){
		System.out.println("m2 of class A");
	}
	@Test(groups={"Regression","Pradip"})
	public void m3(){
		System.out.println("m3 of class A");
	}
	@Test
	public void m4(){
		System.out.println("m4 of class A");
	}
	@Test(groups={"Pradip"})
	public void m5(){
		System.out.println("m5 of class A");
	}
	@Test(groups={"Pradip"})
	public void m6(){
		System.out.println("m6 of class A");
	}

}
