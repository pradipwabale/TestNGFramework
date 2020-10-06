package TestNG;

import java.io.IOException;

import org.testng.annotations.Test;

@Test
public class ExceptionThrowDemo {
	@Test(expectedExceptions={ArithmeticException.class})
	public void m1(){
		System.out.println("Hello Pradip");
		throw new ArithmeticException();
	}
	@Test(expectedExceptions={IOException.class})
	public void m2() throws IOException{
		System.out.println("m2");
		throw new IOException();
	}

}
