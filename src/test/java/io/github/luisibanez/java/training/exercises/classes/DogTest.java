package io.github.luisibanez.java.training.exercises.classes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Dog.
 */
public class DogTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DogTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DogTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDog()
    {
        System.out.println("Whoof!");
        assertTrue( true );
    }
}
