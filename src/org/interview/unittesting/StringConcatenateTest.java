package org.interview.unittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;
import org.junit.runners.Parameterized.Parameters;

public class StringConcatenateTest {
	
	private StringConcatenate stringConcatenate;
	
	@Before
	public void beforeConcatenateTest(){
		stringConcatenate = new StringConcatenate();
	}
	
	@Test
	//@Parameters({"a","b","flag"})
	public void concatenateTest(String a, String b,boolean flag){
		String result = null;
		
		result = stringConcatenate.concatenate(flag, a, b);
		if(flag){
			assertEquals("ab", result);
		}else{
			assertNotEquals("ab",result);
		}
		
		
	}

}
