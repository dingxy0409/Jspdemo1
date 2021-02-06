//before run the Junit test. need to add library-->Junit-->next-->select Junit5-->finish
//or manually download junit.jar & hamcrest-core.jar and add as external jar
package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dev.Sum;

public class sumtest {
	
	//use setup() Junit
	@Before
	public void Setup() {
		System.out.println("setupmethodcalled");
	}
	
	//when test, need use @Test and import org.junit.Test
	//test if Sum.java work
	@Test
	public void checkpositive() {
		assertEquals(30, Sum.add(10, 20));
	}
	
	//tearDown() Junit method
	@After
	public void tearDown() {
		System.out.println("setupmethodclosed");
	}
	


}
