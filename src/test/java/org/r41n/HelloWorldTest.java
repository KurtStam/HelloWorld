package org.r41n;

import org.junit.Test;

import junit.framework.Assert;

public class HelloWorldTest {

	@Test
	public void test() {
		
		Hello hw = new Hello();
		hw.print();
		System.out.println("HHHHH");
		Assert.assertEquals("Hey",hw.print());
	}

}
