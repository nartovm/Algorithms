package dev.nartov;

import java.util.HashMap;

public class Main {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
//            map.merge(c, 1, Integer::sum);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }

    public int firstUniqChar2(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, false);
            } else {
                map.put(c, true);
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!map.get(c)) return i;
        }
        return -1;
    }
}