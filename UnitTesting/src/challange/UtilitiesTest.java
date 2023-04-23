package challange;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
    }

    @Test
    public void removePairs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
    }

    @Test
    public void converter() {
    }

    @Test
    public void nullIfOddLength() {
    }
}