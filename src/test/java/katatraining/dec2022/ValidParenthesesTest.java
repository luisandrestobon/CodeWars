package katatraining.dec2022;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    @Test
    public void sampleTest() {
        assertTrue(ValidParentheses.validParentheses( "()" ));
        assertFalse(ValidParentheses.validParentheses( "())" ));
        assertTrue(ValidParentheses.validParentheses( "32423(sgsdg)" ));
        assertFalse(ValidParentheses.validParentheses( "(dsgdsg))2432" ));
        assertTrue(ValidParentheses.validParentheses( "adasdasfa" ));
    }
}
