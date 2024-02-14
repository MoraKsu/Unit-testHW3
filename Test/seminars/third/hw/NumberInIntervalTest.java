package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberInIntervalTest {
    @Test
    public void testNumberInsideInterval() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.numberInInterval(30));
    }

    @Test
    public void testNumberOnLowerBoundary() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(25));
    }

    @Test
    public void testNumberOnUpperBoundary() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(100));
    }

    @Test
    public void testNumberBelowInterval() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(20));
    }

    @Test
    public void testNumberAboveInterval() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(105));
    }

    @Test
    public void testNegativeNumber() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(-30));
    }
}
