package katatraining;

public class SplitStrings {
    public static String[] solution(String s) {
        String[] output = new String[(s.length() + 1) / 2];
        //Write your code here
        for (int i = 0; i < s.length(); i = i + 2) {
            output[i/2] = "" + s.charAt(i) + (i + 1 < s.length() ? s.charAt(i + 1) : '_');
        }
        return output;
    }
}