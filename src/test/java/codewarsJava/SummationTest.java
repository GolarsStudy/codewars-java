package codewarsJava;

import junit.framework.TestCase;

public class SummationTest extends TestCase {
    public void testSummation() throws Exception {
        assertEquals(1, Summation.summation(1));
        assertEquals(3, Summation.summation(2));
        assertEquals(36, Summation.summation(8));
    }
}