package org.example;

import java.util.*;

public class Main {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;

        int i = 0;
        int j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.add(s.charAt(j))) {
                int length = j - i;
                if (length > max) max = length;
                while (!set.add(s.charAt(j))) {
                    set.remove(s.charAt(i++));
                }
            }
            j++;
        }
        if (j > i && j == s.length()) {
            int length = j - i;
            if (length > max) max = length;
        }
        return max;
    }
}