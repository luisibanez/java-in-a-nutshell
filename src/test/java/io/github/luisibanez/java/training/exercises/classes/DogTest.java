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
    public void testDogSetGetMethods()
    {
        Dog spot = new Dog();

        System.out.print("Testing weight methods...");
        spot.setWeight(15);
        assertTrue( spot.weight() == 15 );
        spot.setWeight(25);
        assertTrue( spot.weight() == 25 );
        System.out.println("PASSED!");

        System.out.print("Testing age methods...");
        spot.setAge(3);
        assertTrue( spot.age() == 3 );
        spot.setAge(5);
        assertTrue( spot.age() == 5 );
        System.out.println("PASSED!");

        System.out.print("Testing hair color methods...");
        spot.setHairColor(Dog.HairColor.BLACK);
        assertTrue( spot.hairColor() == Dog.HairColor.BLACK );
        spot.setHairColor(Dog.HairColor.WHITE);
        assertTrue( spot.hairColor() == Dog.HairColor.WHITE );
        spot.setHairColor(Dog.HairColor.YELLOW);
        assertTrue( spot.hairColor() == Dog.HairColor.YELLOW );
        spot.setHairColor(Dog.HairColor.BROWN);
        assertTrue( spot.hairColor() == Dog.HairColor.BROWN );
        System.out.println("PASSED!");

        System.out.print("Testing hair length methods...");
        spot.setHairLength(Dog.HairLength.SHORT);
        assertTrue( spot.hairLength() == Dog.HairLength.SHORT );
        spot.setHairLength(Dog.HairLength.LONG);
        assertTrue( spot.hairLength() == Dog.HairLength.LONG );
        spot.setHairLength(Dog.HairLength.VERYLONG);
        assertTrue( spot.hairLength() == Dog.HairLength.VERYLONG );
        System.out.println("PASSED!");
    }
}
