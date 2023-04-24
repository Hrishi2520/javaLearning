package challange;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[] {'h','e','l','l','o'}, 2);
        assertArrayEquals(new char[] {'e','l'}, output);
        char[] output2 = util.everyNthChar(new char[] {'h','e','l','l','o'}, 8);
        assertArrayEquals(new char[] {'h','e','l','l','o'}, output2);
    }

    @Test
    public void removePairs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertNull("did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @Test
    public void converter() {
        Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 5));
    }

    @Test
    public void nullIfOddLength() {
        Utilities util = new Utilities();
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}