package dev.nartov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public String[] findRestaurant(String[] list1, String[] list2) {
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