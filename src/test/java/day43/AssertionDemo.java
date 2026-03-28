package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void TestTitle(){
		String exp_title="OpenCart";
		String act_title="OpenShop";
//		if(exp_title.equals(act_title)) {
//			System.out.println("passs");
//		}
//		else {
//			System.out.println("no");
//		}
		Assert.assertEquals(exp_title, act_title);
	}
	

}
