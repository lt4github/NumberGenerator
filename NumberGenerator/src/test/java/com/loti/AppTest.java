package com.loti;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Assert;
//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest // extends TestCase
{
	//@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
	
	
		
    /**
     * Create the test case
     *
     * @param testName name of the test case
    
    public AppTest( String testName )
    {
        super( testName );
    }
     */

    /**
     * @return the suite of tests being tested
     
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    */

    /**
     * Rigourous Test :-)
    
    public void testApp()
    {
        assertTrue( true );
    }
     */
}
