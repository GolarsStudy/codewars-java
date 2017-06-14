package codewarsJava;

import junit.framework.TestCase;

public class NthSeriesTest extends TestCase {

    public void testSeriesSum() throws Exception {
        assertEquals(NthSeries.seriesSum(5), "1.57");
        assertEquals(NthSeries.seriesSum(9), "1.77");
        assertEquals(NthSeries.seriesSum(15), "1.94");
    }

    public void testSeriesSumShort() throws Exception {
        assertEquals(NthSeries.seriesSumShort(5), "1.57");
        assertEquals(NthSeries.seriesSumShort(9), "1.77");
        assertEquals(NthSeries.seriesSumShort(15), "1.94");
    }
    public void testSeriesSumBest() throws Exception {
        assertEquals(NthSeries.seriesSumShort(5), "1.57");
        assertEquals(NthSeries.seriesSumShort(9), "1.77");
        assertEquals(NthSeries.seriesSumShort(15), "1.94");
    }
}