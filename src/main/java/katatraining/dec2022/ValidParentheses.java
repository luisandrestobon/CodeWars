package katatraining.dec2022;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    private static final char OPEN_PARENTHESIS = '(';
    private static final char CLOSE_PARENTHESIS = ')';

    public static boolean validParentheses(String parens) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char character : parens.toCharArray()) {
            if (character == OPEN_PARENTHESIS) {
                deque.push(character);
            } else if (character == CLOSE_PARENTHESIS && (deque.isEmpty() || deque.pop() != OPEN_PARENTHESIS)) {
                return false;
            }
        }
        return deque.isEmpty();
    }

}
