package codewarsJava;

import junit.framework.TestCase;

public class LuckyTicketTest extends TestCase {

    public void testNumberOfTickets() throws Exception {
        LuckyTicket luckyTicket = new LuckyTicket();
        assertEquals(50412, luckyTicket.numberOfTickets(100000, 999999));
    }
}