package dev.nartov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!Objects.equals(mapS.put(s.charAt(i), i), mapT.put(t.charAt(i), i))) return false;
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        int[] map1 = new int[128];
        int[] map2 = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char sCharCode = s.charAt(i);
            char tCharCode = t.charAt(i);

            if (map1[sCharCode]!= map2[tCharCode])
                return false;

            map1[sCharCode] = i + 1;
            map2[tCharCode] = i + 1;
        }
        return true;
    }
}