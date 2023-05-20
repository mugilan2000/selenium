package testPackage;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups= {"Mygroup"})
	public void greeting() {
		System.out.println("Happy birthday");
	}

}
