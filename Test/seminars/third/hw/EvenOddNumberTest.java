package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddNumberTest {
    @Test
    public void testEvenNumber() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.evenOddNumber(7));
    }

    @Test
    public void testZero() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(-6));
    }

    @Test
    public void testNegativeOddNumber() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.evenOddNumber(-9));
    }
}
