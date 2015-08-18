package com.mkyong.common;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
/**
 * Advice – Indicate the action to take either before or after the method execution.
Pointcut – Indicate which method should be intercept, by method name or regular expression pattern.
Advisor – Group ‘Advice’ and ‘Pointcut’ into a single unit, and pass it to a proxy factory object.

 */

public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
