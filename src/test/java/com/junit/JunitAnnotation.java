package com.junit;

import org.junit.Assert;
import org.junit.Test;

public class JunitAnnotation {
	@Test
	public void announce() {
		String aa = "Mersal";
		Assert.assertTrue(true);
		System.out.println(aa);
	}
	@Test
	public void annotation() {
		String aa = "NK";
		Assert.assertFalse(false);
		System.out.println(aa);
	}

	@Test
	public void annotaion1() {
		String aa = "MersalNK";
		Assert.assertTrue(false);
		System.out.println(aa);
	}

	@Test
	public void annotation2() {
		String aa = "Racket";
		Assert.assertFalse(true);
		System.out.println(aa);
	}

	@Test
	public void annotation3() {
		String aa = "K.G.F";
		Assert.assertEquals("K.G.F", aa);
		System.out.println("Yash");
	}

	@Test
	public void annotation4() {
		String aa = "KGF";
		Assert.assertNotEquals("King", aa);
		System.out.println(aa);
	}
	@Test
	private void annotation5() {
String aa = "PS1";
Assert.assertNotEquals("Surya", aa);
System.out.println();
	}

}
