package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitClass {

	@BeforeClass
	public static void first() {
		System.out.println("NK");
	}

	@AfterClass
	public static void last() {
		System.out.println("Nk Last");
	}

	@Test
	public void middle() {
		System.out.println("Nk Middle");
	}

	@Before
	public void side() {
		System.out.println("Nk TopAngle");
	}

	@After
	public void leftSide() {
		System.out.println("Nk LoweAngle");
	}

}
