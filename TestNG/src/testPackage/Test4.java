package testPackage;

import org.testng.annotations.Test;

public class Test4 {
	
	@Test(groups= {"Mygroup"})
	public void day1() {
		System.out.println("Sunday");
	}
	@Test
	public void Monthday2()
	{
		System.out.println("Monday");
	}
	@Test
	public void Monthday3()
	{
		System.out.println("Saturday");
	}

}
