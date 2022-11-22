package katatraining.nov2022;

import java.util.StringJoiner;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] words = original.split("\\s+");
        String[] spaces = original.split("\\S+");
        for (int i = 0; i < words.length; i++) {
            char[] charWord = words[i].toCharArray();
            reverseCharArray(charWord);
            words[i] = String.valueOf(charWord);
        }
        return joinWordsAndSpaces(words, spaces);
    }

    public static void reverseCharArray(char[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static String joinWordsAndSpaces(String[] words, String[] spaces) {
        if (words.length == 0) {
            return spaces[0];
        }
        if (spaces.length == 0) {
            return words[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(spaces[i]);
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
