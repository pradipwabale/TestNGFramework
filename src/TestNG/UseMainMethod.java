package TestNG;

import org.testng.annotations.Test;

public class UseMainMethod {
	public static void main(String[] args) {
		System.out.println("main method used");
	}
	
	@Test(priority=-10)
	public void m1(){
		System.out.println("m1 method used");
	}

}
