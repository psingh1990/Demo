package com.example.SpringBootSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;;

public class HelloControllerTest {

	@Test
	public void testHomeMethod() {
		HelloController hc = new HelloController();
		String str = hc.home();
		assertEquals("Hello Chutiya!", str);
	}

}
