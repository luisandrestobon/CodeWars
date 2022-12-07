package katatraining.dec2022;

import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(s -> isSubstringOf(s, array2))
                .sorted()
                .toArray(String[]::new);
    }

    private static boolean isSubstringOf(String sub, String[] array) {
        return Arrays.stream(array)
                .anyMatch(b -> b.contains(sub));
    }
}
