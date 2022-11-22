package katatraining.nov2022;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        if (str.length() < ending.length()) {
            return false;
        }
        String lastLetters = str.substring(str.length() - ending.length());
        return ending.equals(lastLetters);
    }
}
