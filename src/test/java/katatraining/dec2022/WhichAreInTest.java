package katatraining.dec2022;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WhichAreInTest {
    @Test
    public void test1() {
        String[] array1 = new String[]{ "arp", "live", "strong" };
        String[] array2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] expected = new String[] { "arp", "live", "strong" };
        String[] actual = WhichAreIn.inArray(array1, array2);
        assertArrayEquals(expected, actual);
    }
}
