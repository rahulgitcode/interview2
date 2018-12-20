package org.interview.unittesting;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class StringConcatenateTest {
	
	private StringConcatenate stringConcatenate;
	
	@BeforeMethod
	public void beforeConcatenateTest(){
		stringConcatenate = new StringConcatenate();
	}
	
	@Test
	@Parameters({"a","b","flag"})
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
