package codewarsJava;

import junit.framework.TestCase;

public class LineTest extends TestCase {

    public void testTickets() throws Exception {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
        assertEquals("NO", Line.Tickets(new int []{25, 100}));
        assertEquals("NO", Line.Tickets(new int []{25,50,25,100,25,25,25,100,25,25,50,100,50,25}));
        assertEquals("YES", Line.Tickets(new int []{25,50,25,100,25,25,25,100,25,25,50,100,25,25,50,100,25,25,25,100}));
        assertEquals("NO", Line.Tickets(new int []{25,25,50,100,25,25,50,100,25,50,25,100,25,50,25,100,100,25}));
    }
}