package org.r41n;

import org.junit.Test;

import junit.framework.Assert;

public class HelloWorldTest {

	@Test
	public void test() {
		
		Hello hw = new Hello();
		hw.print();
		System.out.println("yoho yoho yoho f");
		Assert.assertEquals("Hey",hw.print());
	}

}
