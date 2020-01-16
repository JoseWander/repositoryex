package com.zetcode.repositoryex;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RepositoryexApplicationTests extends TestCase {

	   /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RepositoryexApplicationTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RepositoryexApplicationTests.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
