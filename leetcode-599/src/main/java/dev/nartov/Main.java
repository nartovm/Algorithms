package dev.nartov;

import java.util.*;

public class Main {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        // Store list1's restaurants and their indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new LinkedList<>();
        int minSum = Integer.MAX_VALUE; // Initialize minSum with the maximum possible value

        for (int i = 0; i < list2.length; i++) {
            String restaurant = list2[i];
            if (map.containsKey(restaurant)) {
                int indexSum = map.get(restaurant) + i;
                // If the current indexSum is less than the known minSum, clear the result and update minSum
                if (indexSum < minSum) {
                    result.clear();
                    result.add(restaurant);
                    minSum = indexSum;
                    // If the current indexSum equals the known minSum, just add the restaurant to result
                } else if (indexSum == minSum) {
                    result.add(restaurant);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public String[] findRestaurant2(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map.containsKey(s)) {
                map2.put(s, map.get(s) + i);
            }
        }
        if (map2.size() == 1)
            return map2.keySet().toArray(new String[0]);
        else {
            int min = Integer.MAX_VALUE;
            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                String k = entry.getKey();
                Integer v = entry.getValue();
                if (v < min)
                    min = v;
            }

            int i = 0;
            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                String k = entry.getKey();
                Integer v = entry.getValue();
                if (v == min) list1[i++] = k;
            }
            return Arrays.copyOf(list1, i);
        }
    }
}