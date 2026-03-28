package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertion {

//	@Test	
//	void test_HardAssertion()
//	{
//		System.out.println("testign.,.,.,");	
//		System.out.println("testign.,.,.,");	
//		
//		Assert.assertEquals(1, 2);
//		System.out.println("testign.,.,.,");	
//		System.out.println("testign.,.,.,");	
//	}
	
	@Test	
	void test_SoftAssertion()
	{
		System.out.println("testign.,.,.,");	
		System.out.println("testign.,.,.,");	
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);;
		System.out.println("testign.,.,.,");	
		System.out.println("testign.,.,.,");
		
		sa.assertAll();
	}
}
