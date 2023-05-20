package testPackage;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void PrintText(){
		System.out.println("Hello world");
	}
	@Test(groups= {"Mygroup"})
	public void PrintHi()
	{
		System.out.println("Hi");
	}

}
