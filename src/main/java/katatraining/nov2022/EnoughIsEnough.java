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
        for (int i = 0; i < elements.length; i++) {
            if (occurrences.containsKey(elements[i]) && occurrences.get(elements[i]) >= maxOccurrences) {
                continue;
            } else if (occurrences.containsKey(elements[i]) && occurrences.get(elements[i]) < maxOccurrences) {
                occurrences.put(elements[i], occurrences.get(elements[i]) + 1);
                filteredOccurrences.add(elements[i]);
            } else {
                occurrences.put(elements[i], 1);
                filteredOccurrences.add(elements[i]);
            }
        }
        return filteredOccurrences.stream().mapToInt(Integer::intValue).toArray();
    }
}
