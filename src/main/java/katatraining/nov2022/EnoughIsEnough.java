package katatraining.nov2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences < 1) {
            return new int[] {};
        }
        Map<Integer, Integer> occurrences = new HashMap<>();
        List<Integer> filteredOccurrences = new ArrayList<>();
        for (final int element : elements) {
            if (occurrences.containsKey(element) && occurrences.get(element) < maxOccurrences) {
                occurrences.put(element, occurrences.get(element) + 1);
                filteredOccurrences.add(element);
            } else if (!occurrences.containsKey(element)) {
                occurrences.put(element, 1);
                filteredOccurrences.add(element);
            }
        }
        return filteredOccurrences.stream().mapToInt(Integer::intValue).toArray();
    }
}
