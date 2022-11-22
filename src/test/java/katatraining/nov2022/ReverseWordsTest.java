package katatraining.nov2022;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseWordsTest {

    @DisplayName("Several words separated by single space")
    @Test
    public void testSeveralWordsSingleSpace() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
    }

    @DisplayName("Single word with no space")
    @Test
    public void testSingleWordNoSpace(){
        assertEquals("elppa", ReverseWords.reverseWords("apple"));
    }

    @DisplayName("No words")
    @Test
    public void testNoWords(){
        assertEquals("", ReverseWords.reverseWords(""));
    }

    @DisplayName("Only spaces")
    @Test
    public void testOnlySpaces(){
        assertEquals("     ", ReverseWords.reverseWords("     "));
    }

    @DisplayName("Several letters separated by single space")
    @Test
    public void testSeveralLettersSingleSpace() {
        assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
    }

    @DisplayName("Several words separated by double space")
    @Test
    public void testSeveralWordsDoubleSpace() {
        assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
    }

    @DisplayName("Several words separated by different space")
    @Test
    public void testSeveralWordsDifferentSpace() {
        assertEquals("elpuoc tnereffid  decaps   sdrow", ReverseWords.reverseWords("couple different  spaced   words"));
    }

}
