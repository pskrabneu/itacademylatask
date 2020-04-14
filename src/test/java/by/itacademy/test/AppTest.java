package by.itacademy.test;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    /**
     * Create the Test case
     *
     * @param testName nema of the test case
     */
    public AppTest(String testName) {
        super (testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite (AppTest.class);
    }

    /**
     * Rigourous Test
     */
    public void testApp() {
        assertTrue (true);
    }
}
