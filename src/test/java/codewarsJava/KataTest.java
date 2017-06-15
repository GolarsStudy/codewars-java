package codewarsJava;

import junit.framework.TestCase;

public class KataTest extends TestCase {

    public void testFindUniq() throws Exception {
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}));
        assertEquals(2.0, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
}